package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Decorador que indica que esta clase es un controlador de Spring MVC
public class EjemploController {
    
    @GetMapping("/detalles_info") //Mapea la ruta "/detalles_info" a este método, lo que significa que cuando un usuario acceda a esta URL, se ejecutará este método
    public String info(Model model){
        //Aquí puedes agregar datos al modelo que se pasarán a la vista
        model.addAttribute("Titulo", "Servidor en linea"); //Agrega un atributo al modelo con la clave "Titulo" y el valor "Servidor en linea". Este valor se puede acceder en la vista utilizando la clave "Titulo".
        model.addAttribute("Subtitulo", "¡Todo funciona correctamente!");
        model.addAttribute("mensaje", "¡Bienvenido a mi aplicación Spring Boot!");
        return "detalles_info"; //Devuelve el nombre de la vista que se debe renderizar, en este caso, se espera que haya un archivo llamado "detalles_info.html" en el directorio de plantillas (templates) de la aplicación
    }

    /*//Otra forma de escribir el método info utilizando un Map en lugar de Model
    @GetMapping("/detalles_info")
    public String info(Map<String, Object> model){
        //Aquí puedes agregar datos al modelo que se pasarán a la vista
        model.put("Titulo", "Servidor en linea"); //Agrega un atributo al modelo con la clave "Titulo" y el valor "Servidor en linea". Este valor se puede acceder en la vista utilizando la clave "Titulo".
        model.put("Subtitulo", "¡Todo funciona correctamente!");
        model.put("mensaje", "¡Bienvenido a mi aplicación Spring Boot!");
        return "detalles_info"; //Devuelve el nombre de la vista que se debe renderizar, en este caso, se espera que haya un archivo llamado "detalles_info.html" en el directorio de plantillas (templates) de la aplicación
    }
    */
}

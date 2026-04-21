package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //decorador que indica que esta clase es un controlador de Spring MVC
public class EjemploController {
    
    @GetMapping("/detalles_info") //mapea la ruta "/detalles_info" a este método, lo que significa que cuando un usuario acceda a esta URL, se ejecutará este método
    public String info(){
        return "detalles_info"; //devuelve el nombre de la vista que se debe renderizar, en este caso, se espera que haya un archivo llamado "detalles_info.html" en el directorio de plantillas (templates) de la aplicación
    }
    
}

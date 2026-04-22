package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController //Decorador que indica que esta clase es un controlador REST de Spring
@RequestMapping("/api") //Mapea la ruta base "/api" para todos los métodos de este controlador, lo que significa que todas las rutas definidas en este controlador comenzarán con "/api"

public class EjemploRestController {
    
    @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    public Map<String, Object> detalles_info2(){
        Map<String, Object> response = new HashMap<>();
        response.put("Titulo", "Servidor en linea");
        response.put("Subtitulo", "¡Todo funciona correctamente!");
        response.put("mensaje", "¡Bienvenido a mi aplicación Spring Boot!");
        return response;
    }
}

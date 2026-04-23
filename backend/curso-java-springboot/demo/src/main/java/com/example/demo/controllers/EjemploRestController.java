package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Empleados;

@RestController //Decorador que indica que esta clase es un controlador REST de Spring
@RequestMapping("/api") //Mapea la ruta base "/api" para todos los métodos de este controlador, lo que significa que todas las rutas definidas en este controlador comenzarán con "/api"

public class EjemploRestController {

    Empleados empleado1 = new Empleados("Juan", "Pérez", "Calle 123", "Desarrollador", 30, 5551234, 1);

    @GetMapping(path = "/detalles_info2")
    public Map<String, Object> detalles_info2(){
        Map<String, Object> response = new HashMap<>();
        response.put("empleado", empleado1);
        return response;
    }
}

package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.controller;

import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    FirstService firstService;
    @GetMapping("/health")
    public String check() {
        return firstService.check();
    }

}


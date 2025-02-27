package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.controller;

import com.google.gson.Gson;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.CarImageProfiles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service.RekognitionService;

import java.util.List;

public class CarPlateCheckController {
    @PostMapping()
    public ResponseEntity<?> carPlate(@RequestBody String imageName){
        List<CarImageProfiles> carImageProfiles = null;
        //List<CarImageProfiles> carImageProfiles = RekognitionService.getLabelsfromImage(imageName);
        if (!carImageProfiles.isEmpty()){
            return new ResponseEntity<>(new Gson().toJson(carImageProfiles), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(false, HttpStatus.OK);
        }
    }

}

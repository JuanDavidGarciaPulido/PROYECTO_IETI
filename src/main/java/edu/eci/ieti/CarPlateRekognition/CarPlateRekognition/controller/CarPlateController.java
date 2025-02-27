package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.controller;

import com.google.gson.Gson;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.CarImageProfiles;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service.CarImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cars")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CarPlateController {

    @Autowired
    CarImageService carImageProfileService;

    @GetMapping()
    public ResponseEntity<String> getCarProfiles(){
        return new ResponseEntity<>(new Gson().toJson(carImageProfileService.getCarImageProfiles()),HttpStatus.ACCEPTED);
    }

    @PostMapping()
    public ResponseEntity<Object> createCarImageProfile(@RequestBody CarImageProfiles carImageProfile){
        carImageProfileService.createCarImageProfile(carImageProfile);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Object> modifyCarImageProfile(@RequestBody CarImageProfiles carImageProfile){
        carImageProfileService.modifyCarImageProfile(carImageProfile);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Object> deleteCarImageProfile(@RequestBody CarImageProfiles carImageProfile){
        carImageProfileService.deleteDogImageProfile(carImageProfile);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

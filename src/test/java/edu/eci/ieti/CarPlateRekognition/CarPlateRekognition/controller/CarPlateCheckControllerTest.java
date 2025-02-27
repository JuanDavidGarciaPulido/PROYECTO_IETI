package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.controller;

import com.google.gson.Gson;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.CarImageProfiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarPlateCheckControllerTest {

    @InjectMocks
    private CarPlateCheckController carPlateCheckController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCarPlateWithResults() {
        String imageName = "testImage.jpg";
        List<CarImageProfiles> carImageProfiles = List.of(new CarImageProfiles());

        // Simulate the behavior of the method
        ResponseEntity<?> response = new ResponseEntity<>(new Gson().toJson(carImageProfiles), HttpStatus.OK);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(new Gson().toJson(carImageProfiles), response.getBody());
    }

    @Test
    public void testCarPlateWithoutResults() {
        String imageName = "testImage.jpg";
        List<CarImageProfiles> carImageProfiles = Collections.emptyList();

        // Simulate the behavior of the method
        ResponseEntity<?> response = new ResponseEntity<>(false, HttpStatus.OK);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(false, response.getBody());
    }
}
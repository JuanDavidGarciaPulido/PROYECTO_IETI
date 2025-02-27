package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.controller;

import com.google.gson.Gson;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.CarImageProfiles;
import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service.CarImageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CarPlateControllerTest {

    @Mock
    private CarImageService carImageService;

    @InjectMocks
    private CarPlateController carPlateController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testCreateCarImageProfile() {
        CarImageProfiles carImageProfile = new CarImageProfiles();

        ResponseEntity<Object> response = carPlateController.createCarImageProfile(carImageProfile);

        verify(carImageService, times(1)).createCarImageProfile(carImageProfile);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    public void testModifyCarImageProfile() {
        CarImageProfiles carImageProfile = new CarImageProfiles();

        ResponseEntity<Object> response = carPlateController.modifyCarImageProfile(carImageProfile);

        verify(carImageService, times(1)).modifyCarImageProfile(carImageProfile);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void testDeleteCarImageProfile() {
        CarImageProfiles carImageProfile = new CarImageProfiles();

        ResponseEntity<Object> response = carPlateController.deleteCarImageProfile(carImageProfile);

        verify(carImageService, times(1)).deleteDogImageProfile(carImageProfile);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
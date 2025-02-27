package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service;

import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.CarImageProfiles;

import java.util.List;

public interface CarImageService {

    List<CarImageProfiles> getCarImageProfiles();
    void createCarImageProfile(CarImageProfiles carImageProfile);
    void modifyCarImageProfile(CarImageProfiles carImageProfile);
    void deleteDogImageProfile(CarImageProfiles carImageProfile);

}

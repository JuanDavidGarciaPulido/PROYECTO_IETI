package edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.service;

import edu.eci.ieti.CarPlateRekognition.CarPlateRekognition.model.UserProfile;

public interface UserService {

    UserProfile getUserProfile(String email);
    void createUserProfile(UserProfile userProfile);
    UserProfile updateUserProfile(UserProfile userProfile);

}

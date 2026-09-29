package service;

import entity.User;

import java.util.List;

public interface UserService {

    void changePhoneNumber(String finCode, String newPhoneNumber);

    void changePlaceOfBirth(String finCode, String newPlaceOfBirth);


    List<User> getByAgeGreaterThan(Integer age);

    List<User> getByPlaceOfBirth(String placeOfBirth);

    List<User> getByGender(Character gender);

    List<User> getByNameContains(String text);




}

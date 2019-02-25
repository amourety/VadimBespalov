package services;

import models.User;

import java.net.URL;

public interface UsersService {
    void register(String phone, String password);
    URL getPhotoByPhone(String phone);
    User findByPhone(String phone);
    boolean isRegistered(String phone, String password);
}

package services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import forms.UserForm;
import models.User;
import repositories.UsersRepository;


public class UserServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }


    @Override
    public void signUp(UserForm userForm) {
        User newUser = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .email(userForm.getEmail())
                .hashPassword(passwordEncoder.encode(userForm.getPassword()))
                .build();
        usersRepository.save(newUser);

    }
}

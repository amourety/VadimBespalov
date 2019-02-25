package services;

/**
 * Created by amour on 04.09.2018.
 */
import models.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import repositories.UsersRepository;

import java.net.URL;
import java.util.Optional;

public class UserServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void register(String phone, String password) {
        User user = User.builder()
                .phone(phone)
                .hashPassword(passwordEncoder.encode(password))
                .build();
        usersRepository.save(user);
    }

    @Override
    public URL getPhotoByPhone(String phone) {
        Optional<User> user = usersRepository.findByPhone(phone);
        return user.map(User::getPhoto).orElse(null);
    }

    @Override
    public User findByPhone(String phone) {
        return usersRepository.findByPhone(phone).orElse(null);
    }

    @Override
    public boolean isRegistered(String phone, String password) {
        Optional<User> candidateUser = usersRepository.findByPhone(phone);
        return candidateUser.filter(user -> passwordEncoder.matches(password, user.getHashPassword())).isPresent();
    }
}

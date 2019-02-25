package app;

import lombok.SneakyThrows;
import models.User;
import repositories.UsersRepository;
import repositories.UsersRepositoryJdbcImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainUpdateDemo {
    @SneakyThrows
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2018\\seller\\src\\main\\java\\resources\\ru.itis\\application.properties"));
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        User user = usersRepository.findOne(1L);
        System.out.println(user);
        user.setFirstName("IGOR!");
        usersRepository.update(user);
    }
}

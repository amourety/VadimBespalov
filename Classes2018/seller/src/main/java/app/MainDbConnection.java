package app;

import lombok.SneakyThrows;
import models.Role;
import models.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MainDbConnection {
    @SneakyThrows
    public static void main(String[] args) throws SQLException, IOException {
        // объект, который будет хранить информацию для подключения
        Properties properties = new Properties();
        // загружаем параметры подключения из файла
        properties.load(new FileReader("C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2018\\seller\\src\\main\\java\\resources\\ru.itis\\application.properties"));
        // получаем подключения
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));

        // создали выражение для отправки запроса
        Statement statement = connection.createStatement();
        // отправили запрос и получили результат
        ResultSet resultSet = statement.executeQuery("select * from users");
        // сдвинули указатель на первую позицию
        while(resultSet.next()) {
            User user = User.builder()
                    .id(resultSet.getLong("id"))
                    .firstName(resultSet.getString("first_name"))
                    .lastName(resultSet.getString("last_name"))
                    .role(Role.valueOf(resultSet.getString("role")))
                    .build();
            System.out.println(user);
        }

    }
}

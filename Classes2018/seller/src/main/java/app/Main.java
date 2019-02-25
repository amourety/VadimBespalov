package app;

import lombok.SneakyThrows;
import repositories.*;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\Java\\11-702\\WebTaxiService\\src\\main\\resources\\ru.itis\\application.properties"));
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        System.out.println(usersRepository.findOne(1L));
    }
}

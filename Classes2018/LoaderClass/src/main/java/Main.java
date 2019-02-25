import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Paths;

public class Main {

    @Parameter(names = "-classFolder")
    private String classFolder;

    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        try {
            main.run();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void run() throws Exception {

        Files
                .list(Paths.get(classFolder))
                .forEach(file -> {
                    try {
                        URL url = new URL("file://C:\\Users\\amour\\Desktop\\VadimBespalov\\Classes2018\\LoaderClass\\src\\main\\java\\Classes\\");
                        URLClassLoader loader = URLClassLoader.newInstance(new URL[]{url}, getClass().getClassLoader());
                    } catch (Exception e) {
                        throw new NotDirectoryException(e);
                    }
                });
        Class[] classes = {loader.loadClass("User")};
    }

    public void print(Class[] classes) {
        try {
            System.out.println("********************************");
            System.out.println("Classes:");
            for (int i = 0; i < classes.length; i++) {
                System.out.println();
                System.out.println("Class " + classes[i].getName());
                System.out.println("-Fields");
                for (Field field : classes[i].getDeclaredFields()) {
                    System.out.println("  " + field.getType().getSimpleName() + " " + field.getName());
                }
                System.out.println();
                System.out.println("-Methods");
                for (Method method : classes[i].getDeclaredMethods()) {
                    System.out.println("  " + method.getReturnType().getSimpleName() + " " + method.getName());
                    for (Class paramType : method.getParameterTypes()) {
                        System.out.println(paramType.getSimpleName() + " ");
                    }
                    System.out.println();
                }
                System.out.println("-Constructors");
                for (Constructor constructor : classes[i].getDeclaredConstructors()) {
                    for (Class paramType : constructor.getParameterTypes()) {
                        System.out.print("  " + paramType.getSimpleName() + " ");
                    }
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
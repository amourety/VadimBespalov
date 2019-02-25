import java.util.Scanner;

/**
 * Created by amour on 06.08.2018.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Simsik simsik = new Simsik("Vadim");
        Scanner scanner = new Scanner(System.in);
        Smert smert = new Smert(simsik);
        Thread myThread = new Thread(() -> {
            while(simsik.zhiv()){
                System.out.println("info: poest, hochesh, potrahatsya, posrat");
                String command = scanner.next();
                switch (command){
                    case "eat":
                        simsik.poest("Tatmak PIZZA");
                        break;
                    case "say":
                        simsik.sayPotreb();
                        break;
                    case "woohoo":
                        simsik.potrahatsya("Angelina");
                        break;
                    case "fuu":
                        simsik.postrat();
                        break;
                }
            }
        });
        myThread.start();
        smert.start();
        myThread.join();
        smert.join();
        if (!simsik.zhiv()) {
            System.out.println(simsik.getName() + " UMER");
        }
    }
}

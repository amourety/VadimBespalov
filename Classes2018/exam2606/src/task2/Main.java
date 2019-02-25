package task2;

import java.util.Scanner;

/**
 * Created by amour on 26.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        Hero hero = new SnakeHero("Nagaina", "Кушать неугодных МАГЛОВ");
        System.out.println(hero.getName());
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - убить магла/ получить опыт");
        System.out.println("2 - ничего не делать/ ползать около Волан Де Морта");
        while(hero.getExperience() != 300){
            String action = sc.nextLine();
            switch (action){
                case "1":
                    System.out.println("ПОЛУЧЕНО "+ 100 + "ОПЫТА");
                    hero.addEx(100);
                    if(hero.getExperience() >= 100) {
                        hero = new SnakeHeroFlyingDecorator("Nagaina 2.0", "кушать неугодных маглов и летать", hero, hero.getExperience());
                    }
                    if(hero.getExperience() >= 200) {
                        hero = new SnakeHeroSayDecorator("Nagaina 3.0", "не только кушать маглов и летать, но и говорить", hero, hero.getExperience());
                    }
                    System.out.println(hero.getName());
                    break;
                case "2":
                    System.out.println(hero.getName() + " ползает около Волан Де Морта");
                    break;

                default:
                    break;
            }
        }

    }
}

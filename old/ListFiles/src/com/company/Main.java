package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by amour on 01.04.2017.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        String command = "";
        System.out.println("Введите info для получение информации по командам");
        while(!command.equals("exit")){
            command = sc.next();
            String link;
            String link2;
            String link3;
            switch (command){
                case "pwd":
                    fileManager.commandPwd();
                    break;
                case "ls":
                    link = sc.nextLine();
                    link2 = "";
                    for (int i = 1; i < link.length(); i++){
                        link2 += link.charAt(i);
                    }
                    link = link2;
                    switch (link){
                        case "":
                            fileManager.commandLs();
                            break;
                        case "-l":
                            fileManager.commandLs_l();
                            break;
                        case "-a":
                            fileManager.commandLs_a();
                            break;
                        case "-la":
                        case "-al":
                            fileManager.commandLs_la();
                            break;
                        default:
                            System.out.println("Такой команды нет");
                            break;
                    }
                    break;
                case "cd":
                    link = sc.nextLine();
                    link2 = "";
                    for (int i = 1; i < link.length(); i++){
                        link2 += link.charAt(i);
                    }
                    fileManager.cdToLink(link2);
                    break;
                case "rm":
                    link = sc.nextLine();
                    link2 = "";
                    if(link.charAt(1) == '-' && link.charAt(2) == 'r' && link.charAt(3) == ' '){
                        for (int i = 4; i < link.length(); i++){
                            link2 += link.charAt(i);
                        }
                        link = fileManager.getPath() + "/" +link2;
                        File file = new File(link);
                        if(file.isDirectory()){
                            fileManager.remDir(file);
                        }
                        else {
                            System.out.println("Такой директории нет");
                        }
                    }
                    else{
                        for (int i = 1; i < link.length(); i++){
                            link2 += link.charAt(i);
                        }
                        fileManager.remFiles(link2);
                    }
                    break;
                case "cp":
                    link = sc.nextLine();
                    link2 = "";
                    link3 = "";
                    int i = 1;
                    for (; i < link.length() && link.charAt(i) != ' '; i++){
                        link2 += link.charAt(i);
                    }
                    i++;
                    for (; i < link.length() && link.charAt(i) != ' '; i++){
                        link3 += link.charAt(i);
                    }
                    fileManager.commandCp(link2, link3);
                    break;
                case "mv":
                    link = sc.nextLine();
                    link2 = "";
                    link3 = "";
                    i = 1;
                    for (; i < link.length() && link.charAt(i) != ' '; i++){
                        link2 += link.charAt(i);
                    }
                    i++;
                    for (; i < link.length() && link.charAt(i) != ' '; i++){
                        link3 += link.charAt(i);
                    }
                    fileManager.commandMv(link2, link3);
                    break;
                case "info":
                    System.out.println("pwd - положение");
                    System.out.println("ls - вывод файлов");
                    System.out.println("cd - переход");
                    System.out.println("rm - удаление");
                    System.out.println("cp - копирование");
                    System.out.println("mv - перенос");
                default:
                    System.out.println("Такой команды нет");
            }
        }

    }
}

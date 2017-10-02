package main;
import main.data.*;
import main.entities.Track;
import main.utils.UserInteractor;
import main.utils.UserInteractorInterface;
import main.data.ExeptionSearch;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by amour on 15.03.2017.
 */
public class App extends Application{
    private Store storage;
    private UserInteractorInterface interactor;
    public static void main(String args[]){
        App app = new App();
    }
    public void start() {
        try {
            interactor.print("Введите info для получения списка команд");
            String command;
            String stop = "stop";
            while(!(command = interactor.readCommand()).equals(stop)){
                switch(command){
                    case "print":
                        System.out.println("Все хранилище:");
                        System.out.println(storage.printStorage());
                        break;
                    case "sort":
                        System.out.println("Сортировка по автору[Author], названию[Name], длительности[Duration]");
                        command = interactor.readCommand();
                        storage.sort(command);
                        System.out.println("Отсортировано по " + command);
                        break;

                    case "searchName":
                        System.out.println("введите название, автора с новой строки");
                        command = interactor.readCommand();
                        ArrayList<Track> searchedStoreName = storage.searchByTrackName(command);
                        System.out.println("Нашлось:");
                        for(int i = 0; i < searchedStoreName.size();i++){
                            System.out.println(searchedStoreName.get(i));
                        }
                        break;

                    case "add":
                        System.out.println("Введите название название, автора, длительность, жанр с новой строки");
                        storage.addTrack(interactor.readCommand(),interactor.readCommand(),Integer.parseInt(interactor.readCommand()),interactor.readCommand());
                        System.out.println("Добавлено!!!");
                        break;
                    case "searchDur":
                        System.out.println(">= или <= какого-то числа");
                        command = interactor.readCommand();
                        ArrayList<Track> searchedStore = storage.searchByDuration(command,Integer.parseInt(interactor.readCommand()));
                        System.out.println("Нашлось:");
                        for(int i = 0; i < searchedStore.size();i++){
                            System.out.println(searchedStore.get(i));
                        }
                        break;

                    case "remove":
                        System.out.println("Для удаления введите автора и название");
                        command = interactor.readCommand();
                        storage.removeByAuthorAndName(command, interactor.readCommand());
                        System.out.println("Удалено");
                        break;

                    case "info":
                        interactor.print("Команды:" +
                                "\n" + "sort - сортировка" +
                                "\n" + "searchDur - поиск по длительности" +
                                "\n" + "searchName -поиск по имени" +
                                "\n" + "add - добавить трек" +
                                "\n" + "remove - удалить трек" +
                                "\n" + "print - отобразить хранилище" +
                                "\n" + "stop - закрыть программу"
                        );
                        break;

                    default:
                        interactor.print("Неизвестная команда");
                }
            }
        }
        catch(ExeptionSearch ex){
            System.out.println("Неверный параметр");
        }
    }
    public void init() {
        storage = new MusicStore();
        interactor = new UserInteractor();
    }
 }

package mainplayer.simpleplayer;

/**
 * Created by amour on 24.02.2017.
 */
import mainplayer.data.*;
import mainplayer.utils.*;
import java.net.URI;
import java.net.URISyntaxException;


public class App extends Application {
  protected DataReader dataReader;
  protected UserInteractor terminal;
  protected Player player;

  public App(String[] args) {
    super(args);
  }

  @Override
  public void init() {
    this.terminal = UserInteractorFactory.getProduct("Console");
    this.dataReader = DataReaderFactory.getProduct("Local");
  }

  @Override
  public void start() {
    try {
      terminal.write("Введите info для получения списка команд");
      String command;
      while((command = terminal.readCommand()) != null){
        switch(command){
          case "play":  // C:/Users/amour/Desktop/Music/suicidewave.wav
            terminal.write("Введите путь к файлу: ");

            command = terminal.readCommand();
            player = Player.getInstance();
            player.setTrack(dataReader.read(new URI("file:///" + command)));
            player.play();

            break;

          case "pause":

            terminal.write("Трек поставлен на паузу");
            player.stop();
            break;

          case "resume":
            player.resume();
            break;

          case "close":
            terminal.write("Трек закрыт. Можете включить новый");
            player.close();
            break;

          case "scan":
            terminal.write("Введите путь к папке: ");

            command = terminal.readCommand();
            dataReader.scan(new URI("file:///" + command));

            break;

          case "info":
            terminal.write("Команды:" +
                    "\n" + "play - воспроизведение" +
                    "\n" + "pause - пауза" +
                    "\n" + "resume - убрать трек с паузы" +
                    "\n" + "close - закрыть трек" +
                    "\n" + "scan - вывод списка файлов папки"
            );
            break;

          default:
            terminal.write("Неизвестная команда");
        }
      }

    } catch (UserInteractorReadException ex) {
      getErrorInfo(ex, "Невозможно считать команду из-за ошибки");
    } catch (UserInteractorWriteException ex) {
      getErrorInfo(ex, "Ошибка во время вывода");
    } catch (URISyntaxException ex) {
      getErrorInfo(ex, "Ошибка в URI");
    } catch (DataReaderException ex) {
      getErrorInfo(ex, "Ошибка");
    }
  }

  public static void main(String[] args) {
    App app = new App(args);
  }

  private void getErrorInfo(Exception ex, String msg) {
    System.out.print(msg);
    System.err.println(ex.getMessage());
    System.exit(1);
  }
}

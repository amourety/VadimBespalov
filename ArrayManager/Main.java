package ArrayManager;
import java.util.Scanner;

/**
 * Created by amour on 02.10.2017.
 */
public class Main {
    private final static String CASE_CREATE_ARRAY = "CREATE";
    private final static String CASE_ADD_ELEMENT_TO_THE_END = "ADD";
    private final static String CASE_REMOVE_ELEMENT = "REMOVE";
    private final static String CASE_INSERT_ELEMENT = "INSERT";
    private final static String CASE_PRINT_ARRAY = "PRINT";
    private final static String CASE_EXIT = "EXIT";
    private final static String CASE_INFO = "INFO";
    // private final static String CASE_CLEAR = "CLEAR"; /* NOT FIXED *\
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList list = new ArrayList();
        boolean isTyping = true;
        System.out.println("WELCOME TO ARRAY'S MANAGER BY V.BESPALOV");
        sb.append("ARRAY MANAGER COMMANDS\n")
                .append("1.CREATE - CREATE ARRAY\n")
                .append("2.ADD - ADD ELEMENT TO THE END \n")
                .append("3.REMOVE - REMOVE FIRST FOUND ELEMENT\n")
                .append("4.INSERT - INSERT ELEMENT TO ARRAY\n")
                .append("5.PRINT - PRINT ARRAY TO THE CONSOLE\n")
                .append("6.EXIT - EXIT\n")
                .append("7.INFO - INFO ABOUT COMMANDS");
        System.out.println(sb.toString());
        while (isTyping) {
            String command = scanner.nextLine();
            switch (command) {
                case CASE_CREATE_ARRAY:
                    list.create();
                    break;
                case CASE_ADD_ELEMENT_TO_THE_END:
                    list.add();
                    break;
                case CASE_REMOVE_ELEMENT:
                    list.remove();
                    break;
                case CASE_INSERT_ELEMENT:
                    list.insert();
                    break;
                case CASE_PRINT_ARRAY:
                    list.print();
                    break;
                case CASE_EXIT:
                    isTyping = false;
                    break;
                case CASE_INFO: {
                    System.out.println(sb.toString());
                    break;
                }
                default:
                    System.out.println("ENTER INFO OR OTHER COMMAND");
                    break;
            }
        }
    }
}

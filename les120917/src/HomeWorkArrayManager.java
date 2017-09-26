import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amour on 18.09.2017.
 */

public class HomeWorkArrayManager {
    private final static String CASE_CREATE_ARRAY = "CREATE";
    private final static String CASE_ADD_ELEMENT_TO_THE_END = "ADD";
    private final static String CASE_REMOVE_ELEMENT = "REMOVE";
    private final static String CASE_INSERT_ELEMENT = "INSERT";
    private final static String CASE_PRINT_ARRAY = "PRINT";
    private final static String CASE_EXIT = "EXIT";
    private final static String CASE_INFO = "INFO";
    private final static String EXCEPTION = "ARRAY IS NOT CREATED, CREATE AN ARRAY";
    private static int[] array;
    private static int maxCount, count;
    private static Scanner scanner = new Scanner(System.in);
        public static void create(){
            System.out.println("ENTER MAXCOUNT FOR ARRAY");
            maxCount = scanner.nextInt();
            count = maxCount;
            array = new int[maxCount];
            System.out.println();
            for (int i = 0; i < maxCount; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("ARRAY CREATED");
        }
        public static void expand(){
            array = Arrays.copyOf(array, array.length*2);
            maxCount *=2;
            System.out.println("ARRAY EXPANDED");
        }
        public static void add(){
            if (array != null){
                if (count != maxCount) {
                    array[count] = scanner.nextInt();
                    count += 1;
                    System.out.println("ELEMENT ADDED");
                }
                else {
                    expand();
                    add();
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public static void remove(){
            if (array != null){
                int elementPosition = scanner.nextInt()-1;
                for (int i = elementPosition; i< maxCount -1; i++) {
                    array[i] = array[i+1];
                }
                count -= 1;
                System.out.println("ELEMENT REMOVED");
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public static void insert(){
            if (array != null){
                if (count != maxCount) {
                    int insertPosition = scanner.nextInt()-1;
                    int element = scanner.nextInt();
                    for (int i = count - 1; i > insertPosition; i--) {
                        array[i] = array[i - 1];
                    }
                    array[insertPosition] = element;
                    count += 1;
                    System.out.println("ELEMENT ADDED");
                } else {
                    expand();
                    insert();
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public static void print(){
            System.out.println("ELEMENTS OF ARRAY \n");
            if (array != null){
                for (int i = 0; i < count; i++) {
                    System.out.print(array[i] + " ");
                }
            } else {
                System.out.println(EXCEPTION);
            }
        }
        public static void main(String[] args) {
            boolean isTyping = true;
            StringBuilder sb = new StringBuilder();
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
                        create();
                        break;
                    case CASE_ADD_ELEMENT_TO_THE_END:
                        add();
                        break;
                    case CASE_REMOVE_ELEMENT:
                        remove();
                        break;
                    case CASE_INSERT_ELEMENT:
                        insert();
                        break;
                    case CASE_PRINT_ARRAY:
                        print();
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


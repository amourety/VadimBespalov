import java.util.ArrayList;

/**
 * Created by amour on 06.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        String input = "X1:=45;X2:=36;X3:=X1+X2;";
        Analyzer.analyze(input);
        ArrayList<Variable> list = Analyzer.process(input);
        System.out.println(list.toString());
    }

}

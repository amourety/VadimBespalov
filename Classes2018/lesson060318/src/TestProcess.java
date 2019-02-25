import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by amour on 11.04.2018.
 */
public class TestProcess {
    private Analyzer analyzer = new Analyzer();

    @Test (expected = VariableNotFoundException.class)
    public void wrong() {
        String input = "X1:=10;T5:=Z7;";
        ArrayList<Variable> res = analyzer.process(input);
    }

    @Test
    public void right() {
        String input = "X1:=5;Y1:=10;Z1:=X1;";
        ArrayList<Variable> r = Analyzer.process(input);
        ArrayList<Variable> e = new ArrayList<>();

        e.add(new Variable("X1", 5));
        e.add(new Variable("Y1", 10));
        e.add(new Variable("Z1", 5));

        Assert.assertEquals(e.size(), r.size());

        for (int i = 0; i < r.size(); i++) {
            Assert.assertTrue(e.get(i).equalsBoth(r.get(i)));
        }
    }
}

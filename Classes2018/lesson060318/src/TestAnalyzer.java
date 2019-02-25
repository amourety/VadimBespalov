import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amour on 22.03.2018.
 */
public class TestAnalyzer {
    private Analyzer analyzer = new Analyzer();

    @Test
    public void correct() {
        String input = "X1:=128;Y2:=56;Z1:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void unfinished() {
        String input = "X1:=128;Y2:=56;Z1:=X1+Y2;M5:=X1+Y2+Z1";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noLetter() {
        String input = "X1:=128;Y2:=56;51:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noDigit() {
        String input = "X1:=128;Y2:=56;ZA:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noColon() {
        String input = "X1:=128;Y2=56;Z1:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noEquals() {
        String input = "X1:=128;Y2:56;Z1:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noOperation() {
        String input = "X1:=128;Y2:=56;Z1:=X1Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }

    @Test (expected = SyntaxException.class)
    public void noSemicolon() {
        String input = "X1:=128;Y2:=56Z1:=X1+Y2;M5:=X1+Y2+Z1;";
        analyzer.analyze(input);
    }
}

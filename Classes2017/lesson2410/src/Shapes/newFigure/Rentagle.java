package Shapes.newFigure;

/**
 * Created by amour on 24.10.2017.
 */
public class Rentagle extends Figure {
    protected double x = 0;
    protected double y = 0;
    public Rentagle(double x, double y){
        this.x = x;
        this.y = y;
        this.area = x * y;
        this.perimeter = 2*(x+y);
    }
}

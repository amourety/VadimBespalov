package Shapes.newFigure;

/**
 * Created by amour on 24.10.2017.
 */
public class Ellipse extends Figure{
    protected double r1;
    protected double r2;
    public Ellipse(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
        this.perimeter = (6.283 * Math.sqrt(r1*r1 + (r2*r2)/2));
        this.area = 3.1415 * r1 * r2;
    }
}

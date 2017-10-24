package Shapes.Box;

/**
 * Created by amour on 24.10.2017.
 */
public class ShapeInSpace {
    private double x;
    private double y;
    private double z;

    public ShapeInSpace(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    public void move(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void scale(double value){
    }
}

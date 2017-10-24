package Shapes.Box;

import Shapes.Box.ShapeInSpace;

/**
 * Created by amour on 24.10.2017.
 */
public class Sphere extends ShapeInSpace {
    private double radius;

    public Sphere(double radius) {
        super(2,2,2);
        this.radius = radius;
    }

    public void scale(double value){
        this.radius = this.radius * value;
    }

    public double getRadius() {
        return radius;
    }
}

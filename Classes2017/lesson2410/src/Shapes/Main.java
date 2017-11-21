package shapes;

import shapes.box.Box;
import shapes.box.Sphere;
import shapes.newFigure.*;

/**
 * Created by amour on 24.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(1);
        Box box = new Box(1,1,1);
        sphere.move(2,3,5);
        box.move(6,6,6);
        System.out.println(box.getVolume() + " м^3");
        System.out.println(sphere.getVolume() + " м^3");

        Figure[] figures = {new Circle(5), new Ellipse(5,10), new Rentagle(10, 4), new Square(5)};
        for(Figure f: figures){
            System.out.println(f.getArea() + " " + f.getPerimeter());
        }
    }
}

package Shapes;
import Shapes.Box.Box;
import Shapes.Box.Sphere;
import Shapes.newFigure.*;
/**
 * Created by amour on 24.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(100);
        Box box = new Box(10,10,10);
        sphere.move(2,3,5);
        box.move(6,6,6);

        Figure[] figures = {new Circle(5), new Ellipse(5,10), new Rentagle(10, 4), new Square(5)};
        for(Figure f: figures){
            System.out.println(f.getArea() + " " + f.getPerimeter());
        }
    }
}

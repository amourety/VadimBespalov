package shapes.box;

/**
 * Created by amour on 24.10.2017.
 */
public class Box extends ShapeInSpace {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        super(1,1,1);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void scale(double value){
        this.height = this.height * value;
        this.width = this.width * value;
        this.length = this.length * value;
    }
    public double getVolume(){
        return this.height*this.length*this.width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

}

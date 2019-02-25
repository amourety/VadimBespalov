package Task1;

public class Segment {
    private Point begin;
    private Point end;

    public Segment(Point begin , Point end){
        this.begin = begin;
        this.end = end;
    }

    public boolean isTop(Point point){
        double angle = getAngle(this, new Segment(this.begin, point));
        return (Math.sin(angle) > 0);
    }
    public boolean isBottom(Point point){
        double angle = getAngle(this, new Segment(this.begin, point));
        return (Math.sin(angle) < 0);
    }

    public Point getVector(Point begin, Point end){
        return new Point(end.getX() - begin.getX(), end.getY() - begin.getY());
    }

    public double getLength(Point begin, Point end){
        Point vector = getVector(begin, end);
        return  Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY());
    }

    public double getAngle(Segment segment1, Segment segment2){
        double length1 = getLength(segment1.getBegin(), segment1.getEnd());
        double length2 = getLength(segment2.getBegin(), segment2.getEnd());
        Point vector1 = getVector(segment1.getBegin(), segment1.getEnd());
        Point vector2 = getVector(segment2.getBegin(), segment2.getEnd());
        return Math.asin((vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX()) / (length1 * length2));
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }
}

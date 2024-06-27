package IBS_9;

public class Circle extends Figure {
    private double radiys;


    public Circle( double radiys,String color) {
        super(color);
        this.radiys = radiys;
    }

    @Override
    public double area() {
        double s = Math.pow(radiys, 2) * Math.PI;
        return s;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radiys;
    }

}

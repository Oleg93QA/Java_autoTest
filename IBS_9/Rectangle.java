package IBS_9;

import java.util.Random;

public class Rectangle extends Figure {
    private double shirina;
    private double visota;
    public Rectangle( double shirina, double visota,String color){
        super(color);
        this.shirina=shirina;
        this.visota=visota;
    }
    @Override
    public double area() {
        double s = shirina * visota;
        return s;
    }

    @Override
    public double perimeter() {
        return 2 *(shirina+visota);
    }

}

package IBS_9;

public class Triangle extends Figure {
    private double dlina1;
    private double dlina2;
    private double dlina3;

    public Triangle(double dlina1, double dlina2, double dlina3,String color) {
        super(color);
        this.dlina1 = dlina1;
        this.dlina2 = dlina2;
        this.dlina3 = dlina3;

    }

    @Override
    public double area() {
        double p = (dlina1 + dlina2 + dlina3) / 2;
        double s = Math.sqrt( (p *(p - dlina1) *(p - dlina3)* (p - dlina3)));
        return s;
    }

    @Override
    public double perimeter() {
        return dlina3 + dlina1 + dlina2;
    }
}


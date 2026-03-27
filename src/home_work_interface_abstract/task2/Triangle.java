package home_work_interface_abstract.task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    double square() {
        double p = 2 / (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double perimeter() {
        return (a + b + c);
    }
}

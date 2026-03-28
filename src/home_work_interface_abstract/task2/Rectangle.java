package home_work_interface_abstract.task2;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double square() {
        return a * b;
    }

    @Override
    double perimeter() {
        return 2 * (a + b);
    }
}

package home_work_interface_abstract.task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double square() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * getRadius();
    }
}

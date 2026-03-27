/**
 * @autor Igor Ogadyarov
 * created 21/3/26
 */
package home_work_interface_abstract.task2;

//Задача 2:
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Circle circle1 = new Circle(60);
        Rectangle rectangle = new Rectangle(5, 15);
        Rectangle rectangle1 = new Rectangle(10, 30);
        Triangle triangle = new Triangle(6, 10, 4);
        Figure[] FigureOfArray = {circle, circle1, rectangle, rectangle1, triangle};
        double summOfPerimetr = 0;
        for (Figure figure : FigureOfArray) summOfPerimetr += figure.perimeter();
        System.out.println(summOfPerimetr);
    }
}

/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_polymorphism.task1_and_2;

public class Dog extends Animal {
    private Dog() {
    }
    // создаем паттерн синглтона
    // метод instance это поле которое будет принимать объект Dog
    private static Dog instance;
    public static Dog getInstance() {
        if (instance == null) instance = new Dog(); // проверка на существующий объект и присвоим к полю instance
                                                    // приватный объект Dog
        return instance;
    }

    @Override
    public void voice() {
        System.out.println("Burk Burk");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) voice();
        else System.out.println("Собака уходит грустный");
    }
}

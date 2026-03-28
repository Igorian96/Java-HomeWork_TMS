/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_polymorphism.task1_and_2;

public class Animal implements Doingable{
    @Override
    public void voice() {
        System.out.println("Вызов класса Animal method voice");
    }

    @Override
    public void eat(String food) {
        System.out.println("Вызов класса Animal method eat");
    }
}

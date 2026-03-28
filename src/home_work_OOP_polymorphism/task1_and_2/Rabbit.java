/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_polymorphism.task1_and_2;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Cry Cry");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) voice();
        else System.out.println("Кролик уходит грустный");
    }
}

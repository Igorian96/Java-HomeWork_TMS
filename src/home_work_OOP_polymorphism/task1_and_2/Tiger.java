/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_polymorphism.task1_and_2;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Roar Roooar");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) voice();
        else System.out.println("Лев уходит грустный");
    }
}

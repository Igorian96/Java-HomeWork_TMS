/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_polymorphism.task1_and_2;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.eat("Grass");
        Animal rabbit = new Rabbit();
        rabbit.eat("Grass");
        Dog.getInstance().voice();
    }
}

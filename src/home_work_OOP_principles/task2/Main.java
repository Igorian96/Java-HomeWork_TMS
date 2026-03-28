/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_principles.task2;

/**
 * Создать класс Apple и добавить в него поле color с модификатором доступа private и
 * инициализировать его. В методе main другого класса создать объект Apple, и не
 * используя сеттеры изменить значение поля color.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Red");
        System.out.println(apple.getColor());
    }
}

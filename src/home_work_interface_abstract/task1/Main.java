/**
 * @autor Igor Ogadyarov
 * created 21/3/26
 */
package home_work_interface_abstract.task1;
//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные
//классы.

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.displaysThePosition();
        worker.displaysThePosition();
        accountant.displaysThePosition();
    }
}

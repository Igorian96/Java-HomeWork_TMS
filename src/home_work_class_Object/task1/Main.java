/**
 * @autor igorogadyarov
 * created 11.04.2026
 */
package home_work_class_Object.task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Igor", 356, "erteqq@mail.ru");
        User user2 = new User("Igor", 356, "erteqq@mail.ru");
        User user3 = new User("Igor", 356, "erteqq@mail.ru");
        User user4 = new User("Sergey", 354, "qweeqq@mail.ru");
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
        System.out.println(user1.equals(user4));
    }
}

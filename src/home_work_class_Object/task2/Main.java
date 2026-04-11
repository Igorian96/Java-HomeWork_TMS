/**
 * @autor igorogadyarov
 * created 11.04.2026
 */
package home_work_class_Object.task2;

public class Main {
    public static void main(String[] args) {
        Mail mailMain = new Mail("qwrtffw@mail.ru");
        User igor = new User(123, mailMain);
        try {
            User nikita = igor.clone();
            nikita.mail.setMail("jfgdf@mail.ru");
            System.out.println(igor.mail.getMail() + "  " + nikita.mail.getMail());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

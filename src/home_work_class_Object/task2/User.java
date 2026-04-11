/**
 * @autor igorogadyarov
 * created 11.04.2026
 */
package home_work_class_Object.task2;

/**
 * Создать программу для реализации поверхностного и глубокого клонирования объекта
 * класса User. Пусть на вход программе будет передаваться тип операции клонирования
 * (поверхностное клонирование или глубокое), а также id юзера для клонирования.
 */
public class User implements Cloneable {
    private int id;
    Mail mail;

    public User(int id, Mail mail) {
        this.id = id;
        this.mail = mail;
    }

    //реализация поверхностного клонирования
    public User shallowClone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    //реализация глубокого клонирования
    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.mail = (Mail) mail.clone();
        return user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

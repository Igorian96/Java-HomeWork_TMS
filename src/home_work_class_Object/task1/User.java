/**
 * @autor igorogadyarov
 * created 11.04.2026
 */
package home_work_class_Object.task1;

import java.util.Objects;

/**
 * Создать класс для описания пользователя системы. Переопределить в классе методы
 * toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
 * значением полей и сравнить с помощью метода equals.
 */
public class User {
    private String name;
    private int id;
    String mail;

    public User(String name, int id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(mail, user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, mail);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mail='" + mail + '\'' +
                '}';
    }
}

/**
 * @autor igorogadyarov
 * created 11.04.2026
 */
package home_work_class_Object.task2;

public class Mail implements Cloneable {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

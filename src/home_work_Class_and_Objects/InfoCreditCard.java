/**
 * @autor Igor Ogadyarov
 * created 20/3/26
 */
package home_work_Class_and_Objects;

public class InfoCreditCard {
    //Напишите программу, которая создает три
//    объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//    третьей. Выведите на экран текущее состояние всех трех карточек.
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(234525320, 10000);
        CreditCard card2 = new CreditCard(234525321, 500000);
        CreditCard card3 = new CreditCard(234525322, 560000);
        card1.accrue(10000);
        card2.accrue(100000);
        card3.withdraw(60000);
        card1.info();
        card2.info();
        card3.info();
    }
}

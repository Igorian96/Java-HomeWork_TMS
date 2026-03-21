/**
 * @autor Igor Ogadyarov
 * created 20/3/26
 */
package home_work_Class_and_Objects;

public class CreditCard {
    //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//    метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//    который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//    выводит текущую информацию о карточке.
    public int accountNumber;
    public double currentAmount;

    public CreditCard(int accountNumber, double curretAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = curretAmount;
    }

    public void accrue(double current) {
        this.currentAmount = currentAmount + current;
    }

    public void withdraw(double current) {
        if (currentAmount <= 0 || current > currentAmount) {
            System.out.println("На счету не хватает денег для снятии");
        } else this.currentAmount = currentAmount - current;
    }

    public void info() {
        System.out.println("Номер счета: " + accountNumber + ". Текущая сумма: " + currentAmount);
    }
}

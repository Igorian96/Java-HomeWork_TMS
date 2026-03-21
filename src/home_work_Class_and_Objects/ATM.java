/**
 * @autor Igor Ogadyarov
 * created 21/3/26
 */
package home_work_Class_and_Objects;

public class ATM {
    //Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
    //задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
    //метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
    //принимает сумму денег, а возвращает булевое значение - успешность выполнения
    //операции. При снятии денег, функция должна распечатывать каким количеством купюр
    //какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
    //количеством купюр каждого номинала
    int banknote20;
    int banknote50;
    int banknote1000;

    public ATM(int banknote20, int banknote50, int banknote1000) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote1000 = banknote1000;
    }

    public boolean accrue(int money) {
        int sumBanknote = 20 * banknote20 + 50 * banknote50 + 1000 * banknote1000;
        if (money > sumBanknote || money <= 0) {
            System.out.println("Сумму, которое вы хотите снять, больше чем ваша сумма или отрицательная");
            return false;
        } else {
            int[] banknote = new int[3];
            for (int i = 0; i < banknote.length; i++) {
                switch (i) {
                    case 0:
                        banknote[i] = money / 1000;
                        money -= banknote[i] * 1000;
                        System.out.println("Банкнота с номиналом 1000: " + banknote[i] + " шт.");
                        break;
                    case 1:
                        banknote[i] = money / 50;
                        money -= banknote[i] * 50;
                        System.out.println("Банкнота с номиналом 50: " + banknote[i] + " шт.");
                        break;
                    case 2:
                        banknote[i] = money / 20;
                        money -= banknote[i] * 20;
                        System.out.println("Банкнота с номиналом 20: " + banknote[i] + " шт.");
                        break;
                }
            }
            return true;
        }
    }
}

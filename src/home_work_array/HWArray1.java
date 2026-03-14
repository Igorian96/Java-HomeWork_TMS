/**
 * @autor Igor Ogadyarov
 * created 14/3/26
 */
package home_work_array;

public class HWArray1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, 10, -5, -18, 25, 50};
        //task1(array);
        task2(array);
    }
    public static void task1 (int[] array) {
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        for (int number : array) {
            System.out.print(number + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }

    }
    public static void task2 (int[] array) {
        //Найти минимальный-максимальный элементы и вывести в консоль.
        int max = array[0];
        int min = array[0];
        for (int number : array) {
            if(max < number) max = number;
            if(min > number) min = number;
        }
        System.out.println("Минимальное число = " + min + " Максимальное число = " + max);
    }
    public static void task3 (int[] array) {
        //Найти индексы минимального и максимального элементов и вывести в консоль.

    }
}

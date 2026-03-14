/**
 * @autor Igor Ogadyarov
 * created 14/3/26
 */
package home_work_array;

import java.util.Arrays;

public class HWArray1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, 10, -5, -18, 25, 50, 0};
        //task1(array);
        //task2(array);
        //task3(array);
        task4(array);

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
        System.out.println(Arrays.toString(array));

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
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            if(min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Минимальный индекс = " + indexMin + " Максимальный индекс = " + indexMax);
    }
    public static void task4 (int[] array) {
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.
        int counter = 0;
        for (int numer : array) {
            if (numer == 0) counter++;
        }
        if (counter == 0) System.out.println("Нулевых элементов в этом массиве нет");
        else System.out.println("количество нулевых элементов = " + counter);
    }
    public static void task5 (int[] array) {
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.
    }
}

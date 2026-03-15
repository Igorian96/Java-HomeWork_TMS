package home_work_two_array;

import java.util.Random;
import java.util.Scanner;

public class HWArray2 {
    public static void main(String[] args) {
        task1();
    }
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void task1() {
        // 1.1 Создание и заполнение двумерного массива случайными числами
        int[][] array = new int[3][4];
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // Случайные числа от 0 до 9
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // 1.2 Добавление числа, введенного пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для добавления к элементам: ");
        int addNumber = scanner.nextInt();
        long sum = 0;

        System.out.println("Обновленный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += addNumber; // Добавляем число
                sum += array[i][j];       // Считаем сумму
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // 1.3 Вывод суммы
        System.out.println("Сумма всех элементов: " + sum);
    }
}

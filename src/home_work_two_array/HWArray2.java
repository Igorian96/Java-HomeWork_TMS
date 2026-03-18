package home_work_two_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWArray2 {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        task1();
        System.out.println("Задача 2 ");
        task2();
        System.out.println("Задача 3 ");
        task3();
    }
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void task1() {
        // 1.1 Создание и заполнение двумерного массива случайными числами
        int[][] array = new int[4][4];
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
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += addNumber;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов " + sum);
    }
    public static void task2() {
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //teachmeskills.by
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Строки
        int m = sc.nextInt(); // Столбцы
        int[][] a = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = count++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = count++;
                }
            }
        }
        System.out.print(Arrays.deepToString(a));
    }
}

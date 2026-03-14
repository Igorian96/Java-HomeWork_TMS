/**
 * @autor Igor Ogadyarov
 * created 8/3/26
 */
package home_work_operator;

import java.util.Scanner;

public class HWOperator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите чентное или нечетное число ");
        System.out.println(evenOrOdd(number.nextInt()));
        System.out.println("------------------------------------------------------");
        System.out.println("Введите температурру на улице ");
        System.out.println(temperature(number.nextInt()));
        System.out.println("------------------------------------------------------");
        System.out.println("Введите число от 10 до 20 включительно");
        System.out.println(squareOfNumbers(number.nextInt()));
        System.out.println("------------------------------------------------------");
        sequentially();
        System.out.println("------------------------------------------------------");
        additionalTask();



    }
    public static String evenOrOdd(int number) {
        //Напишите программу, которая будет принимать на вход число из консоли и на выход
        //будет выводить сообщение четное число или нет. Для определения четности числа
        //используйте операцию получения остатка от деления
        return ((number % 2) == 0) ? " число четное" : " число нечетное";
    }
    public static String temperature(int gradys) {
        //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»
        return (gradys > -5) ? " Normal" : " Cold";
    }
    public static int squareOfNumbers(int number) {
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        // 10 <= n <= 20
        while ((number >= 21) || (number <= 9)) {
            System.out.println( "Вы ввели не то число, попобуйте еще раз ввести число от 10 до 20 включительно");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        }
        return (int) Math.pow(number, 2);
    }
    public static void sequentially() {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        int x = 7;
        do {
            System.out.print(x + " ");
            x = x + 7;
        }
        while ((x%7 == 0) && (x <= 98));
    }

    public static void additionalTask() {
        //Напишите программу, где пользователь вводит любое целое положительное число. А
        //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        //ввести некорректные данные.
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("Введите целое положительное число: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    flag = true;
                } else {
                    System.out.println("Число должно быть больше 0 ");
                }
            } else {
                System.out.println("Введено не целое число ");
                scanner.next();
            }
        }
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Вывод" + sum);
    }
}

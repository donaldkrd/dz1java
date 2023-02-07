import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ1JAVA {
    public static void main(String[] args) {
        task4();
    }

    static void task4() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите x: ");
        int x = iScanner.nextInt();
        System.out.printf("Введите y: ");
        int y = iScanner.nextInt();
        iScanner.close();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println("Произведение=" + x*y);
        System.out.println("Деление=" + x/y);
    }

}


// static void task3(){
// Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
// делятся только на себя и на единицу без остатка. Чтобы найти остаток от
// деления используйте оператор % , например 10%3 будет равно единице)
// Scanner scanner = new Scanner(System.in);
// System.out.print("Введите число от 1 до 1000: ");
// int input = scanner.nextInt();
// scanner.close();
// List<Integer> primes = new ArrayList<>();
// for (int i = 2; i <= input; i++) {
// boolean isPrimeNumber = true;
// for (int j = 2; j < i; j++) {
// if (i % j == 0) {
// isPrimeNumber = false;
// break;
// }
// }
// if (isPrimeNumber) {
// primes.add(i);
// }
// }
// System.out.println("Простые числа: " + primes);
// }

// static void task2(){
// //Вычислить n! (произведение чисел от 1 до n)
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("Введите число: ");
// int i = iScanner.nextInt();
// System.out.printf("Факториал числа: %d\n", giveMeNumber(i));
// iScanner.close();
// }
// private static int giveMeNumber(int f) {
// int result = 1;
// for (int i = 1; i <= f; i++) {
// result = result * i;
// }
// return result;
// }

// static void task1(){
// //Вычислить n-ое треугольного число(сумма чисел от 1 до n)
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("Введите число: ");
// int i = iScanner.nextInt();
// System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
// iScanner.close();
// }
// public static int giveMeNumber(int a) {
// return (a * (a + 1)) / 2;
// }

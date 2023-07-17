import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task1() {
        System.out.println("Задание №1:");
        System.out.println("Введите возраст человека");

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.close();

        if (age < 0) {
            System.out.println("Этот человек еще не родился");
        } else if (age > 0 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else if (age >= 18 && age < 118) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Так долго не живут =)");
        }
    }

    static void task2() {
        System.out.println("Задание №2:");
        System.out.println("Какая темпиратура на улице?");

        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();
        sc.close();

        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно одеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
}
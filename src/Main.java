import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3(90); // укажите аргумент (скорость автомобиля)
        task4(35); // укажите аргумент (возраст человека)
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

    static void task3(int speed) {
        System.out.println("Задание №3:");

        if (speed > 60) {
            System.out.println("Если скорость " + speed + "км/ч , то придеться заплатить штраф");
        } else if (speed > 0 && speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч , то можно ездить спокойно");
        }
    }

    static void task4(int age) {
        System.out.println("Задание №4:");

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Этот человек не родился или еще слишком юн");
        }
    }
}
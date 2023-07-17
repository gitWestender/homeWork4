import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3(90); // укажите аргумент (скорость автомобиля)
        task4(35); // укажите аргумент (возраст человека)
        task5();
        task6();
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
        System.out.println("\nЗадание №2:");
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
        System.out.println("\nЗадание №3:");

        if (speed > 60) {
            System.out.println("Если скорость " + speed + "км/ч , то придеться заплатить штраф");
        } else if (speed > 0 && speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч , то можно ездить спокойно");
        }
    }

    static void task4(int age) {
        System.out.println("\nЗадание №4:");

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

    static void task5() {
        System.out.println("\nЗадание №5:");

        int age = 8;

        if (age < 5) {
            System.out.println("Если возраст ребенка " + age + "лет, то он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка " + age + "лет, то он может кататься на аттракционе, " +
                    " только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка " + age + "лет, то он может кататься на аттракционе " +
                    " без сопровождения взрослого");
        }
    }

    static void task6() {
        System.out.println("\nЗадание №6:");
        int wagonCap = 102;
        int seatPlaces = 60;
        int standPlaces = wagonCap - seatPlaces;

        if (wagonCap <= 102 && (seatPlaces <= 60 || standPlaces <= (wagonCap - seatPlaces))) {
            System.out.println("Места в вагоне есть");
        } else if (wagonCap <= 102 && (seatPlaces <= 60)) {
            System.out.println("В вагоне есть сидячие места");
        } else if (wagonCap <= 102 && (standPlaces <= (wagonCap - seatPlaces))) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
}
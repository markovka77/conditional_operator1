import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    private static void task7() {

    }

    private static void task6() {
    }

    private static void task5() {
    }

    private static void task4() {
        System.out.println("Задача 4");
        int age = 8;
        boolean institution = age >=2 && age <=6; {
            if (institution) {
                System.out.println("Если возраст человека равен " + age +
                        ", то ему нужно ходить в детский сад.");
            }else {
                System.out.println("пошло оно все, проснусь и сделаю!");

            }


        }

    }

    private static void task3() {
        System.out.println("Задача 3");
         double speedLimit = 63;
         if (speedLimit > 60) {
             System.out.println("Если скорость " + speedLimit +
                     " км/ч, то придется заплатить штраф.");

         }else {
             System.out.println("Если скорость " + speedLimit +
                     " км/ч , то можно ездить спокойно");
         }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int degree = 7;
        if (degree < 5) {
            System.out.println("На улице " + degree + "" +
                    " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + degree +
                    " градусов, можно идти без шапки");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

    }
}
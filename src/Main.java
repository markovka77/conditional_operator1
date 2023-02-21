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
        System.out.println("Задача 7");
        int one = 2;
        int two = 8;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Больше число one");
        }
        else if (one < two && two < three) {
            System.out.println(" Больше число three");
        }
        else {
            System.out.println("Больше число two");
        }

    }

    private static void task6() {
        System.out.println("Задача 6");
        int place = 55;
        if ( place <= 60) {
            System.out.println( "В вагоне есть сидячее место");
        }
        else if ( place > 60 && place < 102) {
            System.out.println("В вагооне есть стоячее место");
        }
        else {
            System.out.println(" Вагон уже полностью забит");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int age = 25;
        if ( age < 5 ) {
            System.out.println("Если возраст ребенка равен " + age +
                    " , то ему нельзя кататься на аттракционе");
        }
        else if ( age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println( "Если возраст ребенка равен " + age +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        int age = 33;
            if ( age >= 2 && age <=6 ) {
                System.out.println("Если возраст человека равен " + age +
                        ", то ему нужно ходить в детский сад.");

            }
            else if ( age >=7 && age < 18) {
                System.out.println("Если возраст человека равен " + age +
                        " ,  то ему нужно ходить в школу.");
            }
           else if ( age >= 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age +
                        " , то ему нужно ходить в университет." );
            }

           else {
                System.out.println("Если возраст человека равен " + age +
                        ", то ему нужно ходить на работу.");

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
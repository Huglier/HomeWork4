public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершенолетний");
        } else {
            System.out.println("Если возраст человека " + age + " то он не совершенолетний");
        }


        System.out.println("Задача 2");

        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");

        int speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        else if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println("Задача 4");

        int ageMan = 2;
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        } else if (ageMan >= 7 && 18 > ageMan) {
                System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
            }
            else if (ageMan >= 18 && 24 > ageMan) {
                System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет");
            }
            else if (ageMan >= 24) {
                System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу");
            }


        System.out.println("Задача 5");

        int ageBaby = 5;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на аттракционе");
        }
        else if (ageBaby >= 5 && ageBaby <= 14) {
                System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
            else {
                System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе без сопровождении взрослого");
            }

        System.out.println("Задача 6");

        int place = 50; if (place <= 60) {
            System.out.println("Есть сидячие места");
        } else if (place > 60 && place <=102) {
                System.out.println("Есть стоячие места");
            }
            else  {
                System.out.println("Мест нет");
            }

        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            int bigger = one;
            System.out.println("Большее число one");
        }
        else if (one < two) {
                int bigger = two;
                if (bigger < three){
                    int bigger2 = three;
                    System.out.println("Большее число three");
                }
                else if (bigger>three){
                    int bigger2 = bigger;
                    System.out.println("Большее число two");
                }
            }



    }
}
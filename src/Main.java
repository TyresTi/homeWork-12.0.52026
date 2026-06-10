
public class Main {
    public static void main(String[] args) {
        // Задача №1
        byte age = 33;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
        // Задача №2
        byte temp = 6;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
        // Задача №3
        short speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        // Задача №4
        byte age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет.");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу.");
        }
// Задача №5
        byte age2 = 15;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе.");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься только в сопровождении взрослого.");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься без сопровождения взрослого.");
        }
// Задача №6
        int peopleInTheCarriage = 103;
        int seat = 60 - peopleInTheCarriage;
        int stand = 102 - peopleInTheCarriage;
        if (peopleInTheCarriage == 0) {
            System.out.println("Сейчас в вагоне  " + peopleInTheCarriage + " человек. Вагон полностью пустой.");
        }
        if (peopleInTheCarriage < 60 && seat < 60) {
            System.out.println("Сейчас в вагоне  " + peopleInTheCarriage + " человек. Свободно сидячих мест - " + seat + ". Свободно стоячих мест - 42.");
        }
        if (peopleInTheCarriage >= 60 && peopleInTheCarriage < 102) {
            System.out.println("Сейчас в вагоне  " + peopleInTheCarriage + " человек. Свободно сидячих мест - 0. Свободно стоячих мест - " + stand);
        }
        if (peopleInTheCarriage >= 102) {
            System.out.println("Сейчас в вагоне  " + peopleInTheCarriage + " человека. Вагон уже полностью забит.");
        }
        // Задача №7
        int one = 55533222;
        int two = 44424422;
        int three = 33322222;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one + ".");
        } else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two + ".");
        } else {
            System.out.println("Самое большое число: " + three + ".");
        }
    }
}


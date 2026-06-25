//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        //task2
        System.out.println("Task2");
        for (int q = 10; q >= 1; q = q - 1) {
            System.out.println(q);
        }
        //task3
        System.out.println("Task3");
        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println(w);
        }
        //task4
        System.out.println("Task4");
        for (int e = 10; e >= -10; e--) {
            System.out.println(e);
        }
        //task5
        System.out.println("Task5");
        for (int r = 1904; r <= 2096; r = r + 4) {
            System.out.println(r + " год является високосным");
        }
        //task6
        System.out.println("Task6");
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println(t);
        }
        //task7
        System.out.println("Task6");
        for (int y = 1; y <= 512; y = y * 2) {
            System.out.println(y);
        }
        //task8
        System.out.println("Task8");
        int salary = 29000;
        int total = 0;
        int mounth = 0;
        for (int u = 0; u < 12; u++) {
            total = total + salary;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total + " рублей.");
        }
        //task9
        System.out.println("Task9");
        int salary1 = 29000;
        int total1 = 0;
        int mounth1 = 0;
        int percent = salary / 100;
        for (int u = 0; u < 12; u++) {
            total1 = total1 + salary1 + percent;
            mounth1 = mounth1 + 1;
            System.out.println("Месяц " + mounth1 + ", сумма накоплений равна " + total1 + " рублей.");
        }
        //task10
        System.out.println("Task10");
        for (int p = 1; p <= 10; p++) {
            System.out.println("2 * " + p + " = " + (2 * p));
        }
    }
}





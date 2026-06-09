//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача №1
        int a = 2147483647;
        byte b = 127;
        short c = 32767;
        long d = 9223372036854775807L;
        float e = 1.7777777F;
        double f = 1.7777777777777777;
        System.out.println("Значиние переменной а с типом int равно " + a);
        System.out.println("Значиние переменной b с типом byte равно " + b);
        System.out.println("Значиние переменной c с типом short равно " + c);
        System.out.println("Значиние переменной d с типом long равно " + d);
        System.out.println("Значиние переменной e с типом float равно " + e);
        System.out.println("Значиние переменной f с типом double равно " + f);
//Задача №2
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
//Задача №3
        byte studentsTeach1 = 23;
        byte studentsTeach2 = 27;
        byte studentsTeach3 = 30;
        short totalPaper = 480;
        byte totalStudents = (byte) (studentsTeach1 + studentsTeach2 + studentsTeach3);
        byte paperPerStudent = (byte) (totalPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");
//Задача №4
        byte machinePerformancePerMin = 16 / 2;
        short machinePerformancePerHour = (short) (machinePerformancePerMin * 60);
        short machinePerformancePer20Min = (short) (machinePerformancePerMin * 20);
        short machinePerformancePerDay = (short) (machinePerformancePerHour * 24);
        int machinePerformanceThreeDays = machinePerformancePerDay * 3;
        int machinePerformancePerMonth = machinePerformancePerDay * 31;
        System.out.println("За 20 минут машина произвела " + machinePerformancePer20Min + " бутылок.");
        System.out.println("За сутки машина произвела " + machinePerformancePerDay + " бутылок.");
        System.out.println("За три дня машина произвела " + machinePerformanceThreeDays + " бутылок.");
        System.out.println("За 1 месяц машина произвела " + machinePerformancePerMonth + " бутылок.");
//Задача №5
        byte totalCans = 120;
        byte cansPerClass = 2 + 4;
        byte classesAtSchool = (byte) (totalCans / cansPerClass);
        byte cansOfWhitePaint = (byte) ((byte) classesAtSchool * 2);
        byte cansOfBrownPaint = (byte) ((byte) classesAtSchool * 4);
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски.");
//Задача №6
        short weightOfAllBananas = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        short totalWeight = (short) (weightOfAllBananas + milkWeight + iceCreamWeight + eggWeight);
        float weightInKg = (float) totalWeight / 1000;
        System.out.println("Вес такого завтрака составляет " + totalWeight + " грамм, или " + weightInKg + " кг.");
//Задача №7
        short weightLossGoal = 7000;
        short whenLosing250Gram = (short) (weightLossGoal / 250);
        short whenLosing500Gram = (short) (weightLossGoal / 500);
        short averageValue = (short) ((whenLosing250Gram + whenLosing500Gram) / 2);
        System.out.println("Для похудения на 7кг., при потере веса в 250 грамм в день потребуется " + whenLosing250Gram + " дней, а при потере веса в 500 грамм в день потребуется " + whenLosing500Gram + " дней. В среднем, чтобы добиться результата похудения потребуется " + averageValue + " день.");
//Задача №8
        int mashaSalaryMonth = 67760;
        int denisSalaryMonth = 83690;
        int kristinaSalaryMonth = 76230;
        int mashaSalaryYear = mashaSalaryMonth * 12;
        int denisSalaryYear = denisSalaryMonth * 12;
        int kristinaSalaryYear = kristinaSalaryMonth * 12;
        int mashaSalary10 = (int) (mashaSalaryMonth * 1.10);
        int denisSalary10 = (int) (denisSalaryMonth * 1.10);
        int kristinaSalary10 = (int) (kristinaSalaryMonth * 1.10);
        System.out.println("Маша теперь получает " + mashaSalary10 + " рублей. Годовой доход вырос на " + ((mashaSalary10 * 12) - mashaSalaryYear) + " рублей.");
        System.out.println("Денис теперь получает " + denisSalary10 + " рублей. Годовой доход вырос на " + ((denisSalary10 * 12) - denisSalaryYear) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalary10 + " рубля. Годовой доход вырос на " + ((kristinaSalary10 * 12) - kristinaSalaryYear) + " рублей.");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
//Задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
//Задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Задача №6
        var massFirstBoxer = 78.2;
        var massSecondBoxer = 82.7;
        var totalMassBoxers = massFirstBoxer + massSecondBoxer;
        System.out.println("Общая масса двух бойцов " + totalMassBoxers + " кг.");
        var differenceBoxers = massSecondBoxer - massFirstBoxer;
        System.out.println("Разница между массами двух бойцов " + differenceBoxers + " кг.");
//Задача №7
        var remainderForDivision = massSecondBoxer % massFirstBoxer;
        System.out.println("Остаток от деления между двумя весами " + remainderForDivision + " кг.");
//Задача №8 часть №1
        var totalHours = 640;
        var oneEmployeeWorks = 8;
        var totalEmployees = totalHours / oneEmployeeWorks;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек.");
//Задача №8 часть №2
        var increaseStaff = totalEmployees + 94;
        var totalHoursWithNewStaff = increaseStaff * 8;
        System.out.println("Если в компании работает " + increaseStaff + " человека, то всего " + totalHoursWithNewStaff + " часа работы может быть поделено между сотрудниками.");
    }
}
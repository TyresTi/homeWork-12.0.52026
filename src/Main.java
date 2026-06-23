
public class Main {
    public static void main(String[] args) {

        // Задача №1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача №2
        int clientOS1 = 0;
        int clientDeviceYear = 2011;
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача №3
        int year = 2004;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        // Задача №4
        int deliveryDistance = 1;
        int deleveryTime20 = 1;
        int deleveryTime60 = 2;
        int deleveryTime100 = 3;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + deleveryTime20);
        else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deleveryTime60);
        } else if (deliveryDistance <= 100)
            System.out.println("Потребуется дней: " + deleveryTime100);
        else if (deliveryDistance > 100) System.out.println("Доставки нет");
        // Задача №5
        int monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}







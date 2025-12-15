public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOS = 1; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" ");
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        String message;

        if (clientDeviceYear >= 2015) {
            message = "Установите версию приложения для ";
        } else {
            message = "Установите облегченную версию приложения для ";
        }
        if (clientOS == 1) {
            message = message + "Android по ссылке";
        } else {
            message = message + "iOS по ссылке";
        }
        System.out.println(message);

        System.out.println(" ");
        System.out.println("Задача 3");
        int year = 2020;

        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
        } else {
            deliveryTime = deliveryTime + 1;
        }
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
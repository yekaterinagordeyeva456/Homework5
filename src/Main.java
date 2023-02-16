public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        int year = 16100;
        if (year % 4 == 0 && year % 400 ==0) {
            System.out.println(year + " - год является високосным");
        }else if (year % 100 == 0) {
                System.out.println(year + " - год неявляется високосным");
            } else {
                System.out.println(year + " - год неявляется високосным");
            }
            // Задание 4
            System.out.println("Задание 4");
            int deliveryDistance = 100;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: 1 срок доставки.");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2 срок доставки.");
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: 3 срок доставки.");
            } else {
                System.out.println("Пставка не выполняется");
            }
            // Задание 5
            System.out.println("Задание 5");
            int monthNumber = 16;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("сезон Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("сезон Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("сезон Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("сезон Осень");
                    break;
                default:
                    System.out.println("Такого сезона не существует");
            }
        }
    }
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введены неккоректные данные");
        }


        //Задача 2
        System.out.println("Задача 2");

        clientOS = 1;
        int clientDeviceYear = 2013;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        if (clientOS == 1) {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        //Задача 3
        System.out.println("Задача 3");

        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является высокосным");
        } else {
            System.out.println( year + " год не является высокосным");
        }
    }
}
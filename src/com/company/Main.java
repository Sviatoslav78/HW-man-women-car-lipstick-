package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.print("name: ");           // в начале спрашивается имя, фамилия, пол
        String name = scanner.nextLine();
        System.out.print("surname: ");
        String surname = scanner.nextLine();
        System.out.print("sex: ");
        String sex = scanner.nextLine();

        System.out.println("Hello, " + name + " " + surname);

        if (sex.equalsIgnoreCase("man")) {  // если пол мужской

            Man man = new Man();

            int inputMen = -1; // переменная ввода для мужчины, для выбора функций

            while (inputMen != 6) { // "6" - выход с программы
                menu(); // стандартная менюшка выбора функций(одинаковая для мужчины и женщины)
                inputMen = scanner.nextInt();

                menuForMen(inputMen, man); // менюшка для мужчины(switch, case)

            }

        } else if (sex.equalsIgnoreCase("woman")) { // если пол женский
            Woman woman = new Woman();

            int inputWomen = -1; // переменная ввода для женщины, для выбора функций

            while (inputWomen != 6) { // "6" - выход с программы

                menu(); // стандартная менюшка выбора функций(одинаковая для мужчины и женщины)
                inputWomen = scanner.nextInt();

                menuForWoman(inputWomen, woman); // менюшка для женщины

            }
            System.exit(0);
        } else { // если пол введён некорректно
            System.out.println("Invalid sex input!");
        }
    }

    private static void menu() {
        System.out.println("Enter: \"1\" to add new element, \"2\" to recreate definite element");
        System.out.println("       \"3\" to delete element, \"4\" to delete all elements");
        System.out.println("       \"5\" to show all elements, \"6\" to exit");
    }

    private static void menuForMen(int inputMen, Man man) {
        switch (inputMen) {
            case 1:
                scanner.nextLine();
                System.out.print("Enter mark of the new car: ");
                String mark1 = scanner.nextLine();
                man.addCar(mark1);
                break;
            case 2:
                System.out.print("Enter index of the car you want to replace: ");
                int index = scanner.nextInt();
                System.out.println("Enter mark of the new car: ");
                scanner.nextLine();
                String mark = scanner.nextLine();
                man.recreateCurrentCar(index, mark);
                break;
            case 3:
                System.out.println("Which car you wanna delete?");
                int secIndex = scanner.nextInt();
                man.deleteCar(secIndex);
                break;
            case 4:
                man.deleteAllCars();
                break;
            case 5:
                man.showAllCars();
                break;
        }
    }

    private static void menuForWoman(int inputWomen, Woman woman) {
        switch (inputWomen) {
            case 1:
                scanner.nextLine();
                System.out.print("Enter colour of the lipstick: ");
                String colour1 = scanner.nextLine();
                woman.addLipstick(colour1);
                break;
            case 2:
                System.out.print("Enter index of the lipstick you want to replace: ");
                int index = scanner.nextInt();
                System.out.print("Colour of the new lipstick: ");
                scanner.nextLine();
                String secMark = scanner.nextLine();
                woman.recreateLipstick(index, secMark);
                break;
            case 3:
                System.out.println("Which lipstick u wanna delete?");
                int secIndex = scanner.nextInt();
                woman.deleteLipstick(secIndex);
                break;
            case 4:
                woman.deleteAllLipsticks();
                break;
            case 5:
                woman.showAllLipsicks();
                System.out.println();
                break;
        }
    }

}
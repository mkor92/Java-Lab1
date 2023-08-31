package org.example;

import java.util.Scanner;


public class Menu {
    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, Max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid (4h)");
        System.out.println("e. Avsluta");
        String menuInput = scanner.nextLine();

        switch (menuInput) {
            case "e", "E" -> {
                System.out.println("Programmet avslutades");
                System.exit(0);
            }
            case "1" -> PriceInput.priceInput();
            case "2" -> {
                if (PriceInput.isPriceInput) {
                    MinMax.minMax();
                } else {
                    getMsg();
                    menu();
                }
            }
            case "3" -> {
                if (PriceInput.isPriceInput) {
                    SortPrices.sortPrices();
                } else {
                    getMsg();
                    menu();
                }
            }
            case "4" -> {
                if (PriceInput.isPriceInput) {
                    ChargeTime.chargeTime();
                } else {
                    getMsg();
                    menu();
                }
            }
            default -> {
                System.out.println(menuInput + " är inte ett giltigt val!");
                menu();
            }
        }
    }

    public static void getMsg() {
        System.out.println("Vänligen börja med att mata in dagens priser\n");
    }

    
}


package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month < 0 || month > 12 || year < 0) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("30");
                    break;
                default:
                    if (month == 2 && year % 4 != 0) {
                        System.out.println("28");
                    } else if (month == 2 && year % 100 == 0) {
                        if (year % 400 == 0)
                            System.out.println("29");
                        else
                            System.out.println("28");
                    } else
                        System.out.println("29");
            }
        }
    }
}

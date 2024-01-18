package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        // Validate input
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        // Array to store the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year and update February's days
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[2] = 29; // Leap year
        }

        // Check if the month is valid
        if (month >= 1 && month <= 12) {
            System.out.println(daysInMonth[month]);
        } else {
            System.out.println("Invalid month");
        }
    }

    // Helper method to get the name of the month
    private String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }

}

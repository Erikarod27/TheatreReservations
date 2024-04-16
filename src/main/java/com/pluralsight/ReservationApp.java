package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //get name, date, and tickets as input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.print("What date will you be coming (mm/dd/yyyy): ");
        String dateString = scanner.nextLine().trim();
        //format date
        LocalDate date = LocalDate.parse(dateString, inputFormatter);
        String formattedDate = date.format(outputFormatter);
        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();
        //split name into nameParts array to rename values
        String[] nameParts = name.split("\\s+");
        String lastName = nameParts[1];
        String firstName = nameParts[0];
        //print ticket for single ticket and tickets for multiple tickets
        if (tickets == 1) {
            System.out.printf("%d Ticket reserved for %s under %s, %s", tickets, formattedDate, lastName, firstName);
        } else {
            System.out.printf("%d Tickets reserved for %s", tickets, formattedDate);
        }

    }
}

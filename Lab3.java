// Programmers: Gabe.S and Brodie.R
// Course:  CS 212
// Due Date:2/11/24
// Lab Assignment: 
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

public class BankAtm {
    public static void main(String[] args) {
        System.out.println("This program will allow a customer who wants to deposit to, withdraw from, and check the balance of their bank account..");
        Scanner scanner = new Scanner(System.in);
        double initialbalance = 212.90;
       
        System.out.println("Enter the name");
        String Name = scanner.nextLine();
        System.out.println("Welcome " + Name + " What would you like to do, select d(deposit), w(withdraw), c(check balance), l(leave).");
        String choice = scanner.nextLine();
        while (!choice.equals("l")) {
            if (choice.equals("d")) {
            System.out.println("How much would you like to deposit");
            double deposit = scanner.nextInt();
            double newbalance = initialbalance + deposit; 
            System.out.println("You now have $" + newbalance + " left in your account");
            System.out.println("What would you like to do, select d(deposit), w(withdraw), c(check balance), l(leave).");
            String choice2 = scanner.next();
           } else if (choice.equals("w")) {
            System.out.println("How much would you like to withdraw");
            double withdraw = scanner.nextInt();
            double newbalance = initialbalance - withdraw;
            System.out.println("You now have $" + newbalance + " left in your account");


	    }
    }
}
}


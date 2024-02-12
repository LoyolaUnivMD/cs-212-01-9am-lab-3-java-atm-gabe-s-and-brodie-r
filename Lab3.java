// Programmers: Gabe.S and Brodie.R
// Course:  CS 212
// Due Date:2/11/24
// Lab Assignment: 3
// Problem Statement: You work at a bank and your current project is to design and implement a new interface for a new generation of ATMs.
// Data In: choice of action, how much money to deal with
// Data Out:money in bank acount
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initial_balance = 212.90;
        double current_balance = initial_balance;

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Hello " + name + ". Would you like to ... d(deposit), w(withdraw), c(check balance), l(leave).");
        String choice = input.next();

        while (!choice.equals("l")) {
            if (choice.equals("d")) {
                System.out.println("How much would you like to deposit?");
                double deposit = input.nextInt();
                current_balance = current_balance + deposit;
                System.out.println("You now have $" + current_balance + " left in your account");
            } else if (choice.equals("w")) {
                System.out.println("How much would you like to withdraw?");
                double withdraw = input.nextInt();
                if (withdraw <= current_balance) {
                    current_balance = current_balance - withdraw;
                    System.out.println("You now have $" + current_balance + " left in your account");
                } else {
                    System.out.println("You do not have enough money to withdraw that.");
                }
            } else if (choice.equals("c")) {
                System.out.println("Your current balance is $" + current_balance);
            } else {
                System.out.println("Invalid choice. Please select d, w, c, or l.");
            }

            System.out.println("What would you like to do? Select d(deposit), w(withdraw), c(check balance), l(leave).");
            choice = input.next();
        }
        System.out.println("Thank you for banking with us!");
    }
}


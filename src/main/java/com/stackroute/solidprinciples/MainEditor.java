package com.stackroute.solidprinciples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainEditor {
    public static void main(String[] args) {
        TextEditFunction textEditFunction = new TextEditFunction();
        TextPrintFunction textPrintFunction = new TextPrintFunction();
        textEditFunction.setAuthor("Pushkar Shankar");
        int choice = 0;
        do {
            System.out.println("Hey " + textEditFunction.author + " How Can I help You");
            System.out.println("Select one of the options");
            System.out.println("1.Select 1 to Convert Text to UpperCase\n" +
                    "2.Select 2 to Find Subtext and Delete\n" +
                    "3.Select 3 to Print the Text\n" +
                    "4.Select 4 to Exit\n");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    textEditFunction.allLettersToUpperCase();
                    break;
                case 2:
                    textEditFunction.findSubTextAndDelete("sh");
                    break;
                case 3:
                    textPrintFunction.textPrinter(textEditFunction.author);
                case 4:
                    break;
                    default:
                        System.out.println("Wrong input, please select the correct input");
            }
        } while (choice != 4);
    }
}

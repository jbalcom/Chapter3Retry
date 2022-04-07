package com.company;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randoNbr = new Random();

        System.out.println("PP - 3.1\n");

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();

        String lnPass = "";
        if (lastName.length() < 5)
            lnPass = lastName;
        else
            lnPass = lastName.substring(0,5);

        String password = firstName + lnPass + (randoNbr.nextInt(89) + 10);
        System.out.println("Your random password is " + password);

        System.out.println("\nPP - 3.2\n");

        System.out.print("Enter an integer: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter another integer: ");
        int num2 = scan.nextInt();
        scan.nextLine();
        int sum = (int) ((Math.pow(num1, 3)) +
                (Math.pow(num2, 3)));
        System.out.println("The sum of cubed " + num1 + " and cubed " + num2
                + " is " + sum + ".");

        System.out.println("\nPP - 3.3\n");

        String pp33Password = "";
        pp33Password += randoNbr.nextInt(2) + 7;
        pp33Password += randoNbr.nextInt(10) + 0;
        for (int i = 0; i < 3; i++){
            pp33Password += (char)(randoNbr.nextInt(26) + 65);
        }

        System.out.println("Password: " + pp33Password);

        System.out.println("\nPP - 3.4\n");

        System.out.print("Enter a decimal number: ");
        double numHold = scan.nextDouble();
        scan.nextLine();

        System.out.println(numHold + " rounded to the nearest whole numbers are " + ((int)Math.floor(numHold)) + " and " + ((int)Math.ceil(numHold)) + ".");

        System.out.println("\nPP - 3.5\n");

        System.out.print("Enter in a x-coordinate for point 1: ");
        int xCoorO = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter in a y-coordinate for point 1: ");
        int yCoorO = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter in a x-coordinate for point 2: ");
        int xCoorT = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter in a y-coordinate for point 2: ");
        int yCoorT = scan.nextInt();
        scan.nextLine();

        double distance = Math.sqrt(Math.exp(xCoorT - xCoorO) - Math.exp(yCoorT - yCoorO));

        System.out.println("The distance from (" + xCoorO + "," + yCoorO + ") and (" + xCoorT + "," + yCoorT + ") is " + distance + ".");
    }
}
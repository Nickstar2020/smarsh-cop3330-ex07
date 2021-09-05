/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //ask for width and height
        System.out.println("what is the length in feet? ");
        int length = scan.nextInt();

        System.out.println("what is the width in feet? ");
        int width = scan.nextInt();

        System.out.print("The room inputted is " + length + " feet by " + width + " feet.");

        //find area of room in feet and meters
        int areaFeet = length * width;
        double areaMeters = areaFeet * 0.09290304;
        System.out.println("\nThe area is: ");
        System.out.println(areaFeet + " square feet.");
        System.out.println(areaMeters + " square meters.");

    }
}

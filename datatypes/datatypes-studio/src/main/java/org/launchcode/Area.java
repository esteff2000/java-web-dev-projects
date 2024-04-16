package org.launchcode;
import java.util.Scanner;

import static org.launchcode.Circle.getArea;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        Double radius = input.nextDouble();

        Double area = getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}

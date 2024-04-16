package org.launchcode;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How long is the rectangle?");
        Double numLength = input.nextDouble();

        System.out.println("How wide is the rectangle?");
        Double numWidth = input.nextDouble();

        Double area = numLength * numWidth;
        System.out.println("The rectangle has an area of " + area);
    }
}

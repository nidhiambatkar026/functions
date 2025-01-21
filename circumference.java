//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class circumference {
    public static double calculateCircumference(double radius){
        double pi= 3.14;
        double circumference = 2*pi*radius;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double radius = sc.nextDouble();

        double result = calculateCircumference(radius);
        System.out.println(result);
    }
}

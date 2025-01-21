//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class avergae {
    public static int calculateAverage(int a, int b, int c){
         int avg = (a+b+c)/3;
         return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b =  sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        int Avg = calculateAverage(a, b, c);
        System.out.println("Average of values are: "+Avg);
    }
}

//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class sumodd {

    public static int calculateOddSum(int n){
        int sum =0;
        for(int i=0; i<=n; i++){
            if(i%2!=0){
             sum = sum +i;
            } 
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        int sum = calculateOddSum(n);
        System.out.println("Sum of all odd numbers is: "+sum);
    }
}

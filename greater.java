//Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;

public class greater {
    public static int findGreater(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int greater = findGreater(a, b);
        System.out.println("Greatest no is: "+greater);
    }
}

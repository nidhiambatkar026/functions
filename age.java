//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class age {
    public static boolean checkAge(int age){
        if(age > 18){
            System.out.println("eligible for voting");
            return true;
        }
        else{
            System.out.println("Not eligible for voting");
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
 
        checkAge(age);
    }
}

import java.util.Scanner;

public class multiple {
    public static int multiply(int a, int b){
        int mult = a*b;
        return mult;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int result = multiply(a, b);
        System.out.println("Result: "+result);
    }
}

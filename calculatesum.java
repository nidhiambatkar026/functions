import java.util.Scanner;

public class calculatesum {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int Sum = calculateSum(a, b);
        System.out.println("Total sum: "+Sum);
    }
}

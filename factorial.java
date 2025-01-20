import java.util.Scanner;

public class factorial {

    public static void calculateFact(int no){
        if(no < 0 ){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=no; i>=1; i--){
            factorial = factorial * i;
        }
            System.out.println(factorial);
            return;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();

        calculateFact(no);
    }
}

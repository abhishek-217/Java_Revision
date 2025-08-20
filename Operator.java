import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");

        int a = scanner.nextInt();
        System.out.println("Enter Second num");

        int b = scanner.nextInt();
        
        int c = a+b;
        System.out.println("Result of Add : " + c);
        int d = a-b;
        System.out.println("Result of Sub : " + d);
        System.out.println(a++ + ++a);
        System.out.println(a == 10.0);

        

        scanner.close();
    }
}

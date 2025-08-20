import java.util.*;
public class Euclidean {

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
      
        int a = scan.nextInt();
        System.out.println("Enter the Second number");
      
        int b = scan.nextInt();

        int ans = gcd(a,b);

        System.out.println("Result is : " + ans);
        scan.close();
    }
}

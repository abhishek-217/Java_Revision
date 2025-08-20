import java.util.*;
public class SwapNIbbles {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num want to swap");
        int num = scan.nextInt();
        
        System.out.println("Num before Swap : "+ num);
        
        int swapnum = ((num & 0x0F) >> 4 | (num & 0x0F) << 4);
        
        System.out.println("Num After Swap : "+ swapnum);

        scan.close();
    }
}

import java.util.*;
public class Booths_algo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        int product = 0;
        int mbits = Integer.toBinaryString(m1).length();

        for(int i=0; i<mbits; i++){
            int currbit = (m1 & 0b1);
            if(currbit == 1){
                product += m2;
            }

            m2 <<= 1;
            m1 >>>= 1;
        }

        System.out.println(product);
    }
}

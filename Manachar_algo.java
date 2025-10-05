import java.util.*;
public class Manachar_algo {

    public static int Solve_mancher(String s, int N){

        // Call the function to get modified function

        String str = getModifiedString(s,N);

        int l = (2*N) +1;
        int[] arr = new int[l];

        // Varable for center and right boundary
        int C = 0, R = 0;

        int maxLen =0;
        
        for(int i=0; i<l; i++){
            // get Mirror index of i
            int mirror = (2*C) -i;

            // To check Left boundary
            if(i< R){
                arr[i] = Math.min(R-i, arr[mirror]);
            }

            int a = i+ (1 + arr[i]);
            int b = i - (1+ arr[i]);

            while(a < l && b >= 0 && str.charAt(a) == str.charAt(b)){
                arr[i]++;
                a++;
                b--;
            }
            
            // To check right boundary
            if(i + arr[i] > R){
                C = i;
                R = i+ arr[i];
                if(arr[i] > maxLen){
                    maxLen = arr[i];

                }
            }
        }

        return maxLen;
    }

    static String getModifiedString(String s, int n){
        StringBuilder str = new StringBuilder();

        for(int i=0; i<n; i++){
            str.append('#');
            str.append(s.charAt(i));
        }

        str.append('#');

        return str.toString();
    }
    public static void main(String[] args){
       String str = "abcbaba";
        System.out.println(Solve_mancher(str, str.length()));
    }
}

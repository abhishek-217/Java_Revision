import java.util.*;

public class CheckStrobogrammatic {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to check : ");
        String num = scan.nextLine();

        if(isStrobogrammatic(num)){
            System.out.println("Yes Bro Your " + num + "is Strobogrammatic");
        }else{
            System.out.println("Sorry Bro Your " + num + "is NOT Strobogrammatic");

        }

        scan.close();
    }

    static boolean isStrobogrammatic(String num){
        int n = num.length();

        Map<Character,Character>mp = new HashMap<>();

        mp.put('0', '0');
        mp.put('1', '1');
        mp.put('8', '8');
        mp.put('6', '9');
        mp.put('9', '6');

        int i=0, j = n-1;

        while( i<= j){
            char l = num.charAt(i);
            char r = num.charAt(j);

            char mapping = mp.getOrDefault(l, '-');

            if(mapping == '-'){
                return false;
            }
            if(mapping != r){
                return false;
            }

            i++;
            j--;
        }

        return true;

    }
}

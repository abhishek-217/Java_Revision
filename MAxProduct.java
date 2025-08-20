import java.util.*;
public class MAxProduct {
    static int Maxpro(int[] arr){
        // BAse case cause we solve using DP

        if(arr.length == 0){
            return 0;
        }

        int maxcurr = arr[0];
        int mincurr = arr[0];
        int result =maxcurr;

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];

            int temp = Math.max(curr, Math.max(curr*maxcurr, curr*mincurr));
            mincurr = Math.max(curr, Math.max(curr*maxcurr, curr*mincurr));
            maxcurr = temp;

            result = Math.max(result, maxcurr);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // List<Integer>arr = Arrays.asList(2,-3,8,9);
        int[] arr = new int[]{2,-3,8,9};

        System.out.println("Maximum product subarray is : "+ Maxpro(arr));

        scan.close();
    }
}

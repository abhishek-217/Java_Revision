import java.util.*;
public class ArrayRotation {

    static void rotateArray(int[] arr, int d){
        int n = arr.length;
        d = d% n;
        if(d == 0){
            return;
        }

        swap(arr, 0, d-1);
        swap(arr, d, n-1);
        swap(arr, 0, n-1);
    }

    static void swap(int[] arr, int s, int e){
        while(s <e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = {4,5,6,7,8,9};
        int rotation = 3;

        rotateArray(arr,rotation);

        for(int i : arr){
            System.out.print(i);
        }
        scan.close();
    }
}

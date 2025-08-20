public class MaxEquilibruim {
    public  static int findMaxEquilibriumSum(int[] arr) {
        // int n = arr.length;
        // if (n == 0) return 0;
        
        // int totalSum = 0;
        // for (int num : arr) {
        //     totalSum += num;
        // }
        
        // int leftSum = 0;
        // int maxSum = Integer.MIN_VALUE;
        // boolean found = false;
        
        // for (int i = 0; i < n; i++) {
        //     // Right sum = totalSum - leftSum - arr[i]
        //     int rightSum = totalSum - leftSum - arr[i];
            
        //     if (leftSum == rightSum) {
        //         maxSum = Math.max(maxSum, arr[i]);
        //         found = true;
        //     }
            
        //     leftSum += arr[i];
        // }
        
        // return found ? maxSum : 0;



        int n = arr.length;

        if(n ==0){
            return 0;
        }

        int tsum =0;

        for(int s: arr){
            tsum += s;
        }
        int maxequi =0;
        int left =0;
        
        boolean flag = false;

        for(int i=0; i<n; i++){
            int right = tsum - left - arr[i];

            if(right == left){
                flag = true;
                maxequi = Math.max(maxequi, arr[i]);
            }

            left += arr[i];

        }
        return flag ? maxequi:0;

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5,3,2,1};

        int res = findMaxEquilibriumSum(arr);

        System.out.println("Min Absolute is : "+ res);
    }
}
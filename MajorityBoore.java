public class MajorityBoore {

    public static int Check(int[] arr){
        int n = arr.length;
        int m =-1;
        int j=0;
        for(int i=0; i<n; i++){
            if(j ==0){
                m = arr[i];
                j =1;
            }else if(m == arr[i]){
                j++;
            }else{
                j--;
            }

        }

        return m;
    }
    public static void main(String[] args){
        int[] arr = {1,4,7,1,2,2,2,2,2,2,1};

        System.out.println("Majority element is : "+ Check(arr));
    }
}

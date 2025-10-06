public class SelectionSORT {

    public static void SortSelection(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

   private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String [] args){

     
        int[] arr = {64,25,12,22,11};

        SortSelection(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }  
    }
}

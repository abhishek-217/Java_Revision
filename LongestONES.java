
public class LongestONES {

   static int  Maxones(int[] a, int k){
        int n = a.length;
        int maxo = 0;
        int count=0;

        int i =0;

        for(int j=0; j<n; j++){
            if(a[j] == 0){
                count++;
            }

            while(count >k){
                if(a[i] == 0){
                    count--;
                }
                i++;
            }

            maxo = Math.max(maxo, j-i +1);
        }

        return maxo;
   }
    public static void main(String[] args){
        int [] a = new int[] {1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k = 2;

        int size = Maxones(a,k);
        System.out.println("Max Ones after subtituting k 0 : "+ size);


    }
}

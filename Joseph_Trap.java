public class Joseph_Trap {

    static int findjoseph(int n, int k){
        if(n == 1){
            return 1;
        }else{
            return (findjoseph(n-1, k) + k - 1 )% n+1;
        }

    }
    public static void main(String[] args){
        int n = 14;
        int k = 2;

        System.out.println(findjoseph(n,k));
    }
}

import java.util.*;
public class AppleAlice {

    public static int Apples(int M,int K, int E,int W, int N, int S){
        if(M <= S*K){
            return M;
        }else if(M <= S*K+ E+W){
            return S*K+ (M- S*K);
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many red apple want you");
        int M = scan.nextInt();

        System.out.println("Number of Apples in every tree");
        int K= scan.nextInt();

        System.out.println("Enter how many tree in East");
        int E = scan.nextInt();

        System.out.println("Enter how many tree in West");
        int W = scan.nextInt();

        System.out.println("Enter how many apple int North");
        int N = scan.nextInt();

        System.out.println("Enter how many apple int south");
        int S = scan.nextInt();

        int res = Apples(M,K,E,W,N,S);

        System.out.println("Minimum Apple can be : " + res);

        scan.close();
    }
}

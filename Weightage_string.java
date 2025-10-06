import java.util.HashSet;

public class Weightage_string {
    static int distinctSubString(String P, String Q, int target, int N){
        HashSet<String>S = new HashSet<String>();

        for(int i=0; i<N; i++){
            int sum =0;

            String s="";
            for(int j=i ; j<N; j++){
                int pos = P.charAt(j) - 'a';

                sum += Q.charAt(pos) - '0';
                s+= P.charAt(j);
                if(sum <= target){
                    S.add(s);
                }else{
                    break;
                }
            }

        }
        return S.size();
    }

    public static void main(String[] args){
        String P = "acbacbacaa";
        String Q = "12300045600078900012345000";
        int target = 2;
        int N = P.length();

        System.out.println(distinctSubString(P,Q,target,N));
    }
}



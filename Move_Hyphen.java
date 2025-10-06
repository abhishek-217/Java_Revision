public class Move_Hyphen {

    public static String Change(String str){
        StringBuilder res = new StringBuilder();

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == '-'){
                res.append(str.charAt(i));
            }
        }
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) != '-'){
                res.append(str.charAt(i));
            }
        }

        return res.toString();

    }
    public static void main(String[] args){
        String str = "a-b-c-d-e-f-g-h-i-j";

        String res = Change(str);
        System.out.println(res);

    }
}

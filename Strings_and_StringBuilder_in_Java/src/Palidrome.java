public class Palidrome {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(isPalidrome(str));
    }
    static  boolean isPalidrome(String str){

        if (str==null ||str.length()==0){
            return true;
        }

        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char strat=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if (strat!=end){
                return false;
            }
        }
        return  true;
    }
}
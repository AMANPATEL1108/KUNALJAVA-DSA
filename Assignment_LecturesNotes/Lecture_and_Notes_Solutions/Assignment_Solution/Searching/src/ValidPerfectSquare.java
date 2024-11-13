public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=16;

    }
    public boolean isPerfectSquare(int num) {

        if (num==1){
            return true;
        }
        for(int i=1;i<=Math.sqrt(num);i++){
            if (i*i==num){
                return true;
            }
        }
        return false;
    }
}

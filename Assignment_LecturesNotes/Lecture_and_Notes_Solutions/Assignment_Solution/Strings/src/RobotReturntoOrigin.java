public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String str="DURDLDRRLL";
        System.out.println(judgeCircle(str));
    }
    public static boolean judgeCircle(String moves) {
        int top = 0,down=0,left=0,right=0;
        for(int i=0;i<moves.length();i++){
            if (moves.charAt(i)=='U'){
                top+=1;
            }
            if (moves.charAt(i)=='D'){
                down+=1;
            }
            if (moves.charAt(i)=='L'){
                left+=1;
            }
            if (moves.charAt(i)=='R'){
                right+=1;
            }


        }
        if (top==down && left==right){
            return true;
        }
        return false;

    }
}

public class ShuffleString {
    public static void main(String[] args) {
    String str="codeleet";
    int[] arr={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str,arr));
    }
    public static String restoreString(String s, int[] indices) {
    String newstr="";
        int count=0;

    for(int i=0;i<indices.length;i++){
        for(int j=0;j<indices.length;j++){
            if (indices[j]==count){
                newstr+=s.charAt(j);
                break;
            }
        }
        count++;

    }
    return newstr;
    }
}

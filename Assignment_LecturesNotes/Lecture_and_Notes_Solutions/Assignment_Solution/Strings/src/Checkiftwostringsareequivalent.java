public class Checkiftwostringsareequivalent {
    public static void main(String[] args) {
        String[] arr={"ab", "c"};
        String[] arr2={"a", "bc"};

        System.out.println(arrayStringsAreEqual(arr,arr2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String newWord1="";
        String newWord2="";

        for(int i=0;i< word1.length;i++){
            newWord1+=word1[i];
        }
        for(int i=0;i< word2.length;i++){
            newWord2+=word2[i];
        }

        if (newWord1.equals(newWord2)) {
            return true;
        }
        return false;
    }
}

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
    int[] arr={7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

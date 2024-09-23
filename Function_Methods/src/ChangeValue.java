import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create Array
        int[] arr={1,3,4,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));  //this is Changeing but  String not Change array is Chage that Value
    }

    static void change(int[] nums){
        nums[0]=99;  //change via object via ref variable same object  will change

    }
}

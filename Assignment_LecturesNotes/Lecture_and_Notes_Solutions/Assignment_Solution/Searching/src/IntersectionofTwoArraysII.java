import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

     static int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer> ls = new ArrayList<>();
         HashMap<Integer,Integer> hm = new HashMap<>();

         for(int i=0;i<nums1.length;i++){
             hm.put(nums1[i] , hm.getOrDefault(nums1[i], 0) + 1);
         }

         for(int i=0;i<nums2.length;i++){
             if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0){
                 ls.add(nums2[i]);
                 hm.put(nums2[i] , hm.get(nums2[i]) - 1);
             }
         }

         int[] result = new int[ls.size()];
         for (int i = 0; i < ls.size(); i++) {
             result[i] = ls.get(i);
         }

         return result;
    }

}

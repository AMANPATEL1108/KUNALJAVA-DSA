import java.util.ArrayList;
import java.util.List;

public class KidWiththeGreatestNumberofcandies {
    public static void main(String[] args) {
        int[] candies={1,3,9};
        int extraCandies=4;
        List<Boolean> newans=kidsWithCandies(candies,extraCandies);
        System.out.println(newans);


    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans=new ArrayList<>();
            int rangeofcand=candies.length-1;
            int max=0;

            for(int i=0;i<=rangeofcand;i++){
                if (candies[i]>max){
                    max=candies[i];
                }
            }
            for(int i=0;i<=rangeofcand;i++){
                candies[i]=candies[i]+extraCandies;
                if (candies[i]>=max){
                    ans.add(true);
                }else{
                    ans.add(false);
                }
            }


        return ans;
    }

}

public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(gain));

    }

    static int largestAltitude(int[] gain) {

        int gainlen=gain.length;
        int[] ans=new int[gainlen+2];
        System.out.println(ans.length);
        ans[0] = 0;
        int counter = 1;
        for(int i=0;i<gainlen;i++){
            ans[counter]=gain[i]+ans[i];
            counter++;
        }

        int max=0;
        for(int i=0;i<ans.length-1;i++){

            if (max<ans[i]){
                max=ans[i];
            }
        }

       return max;
    }
}

public class CountNumberofHomogenousSubstrings {
    public static void main(String[] args) {
String s="abbcccaa";
        System.out.println(countHomogenous(s));
    }

    public static int countHomogenous(String s) {
        long mod=1000000007;
        long cnt=0;
        long ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0 || s.charAt(i)==s.charAt(i-1))
            {
                cnt++;
            }
            else{
                cnt=1;
            }

            ans=(ans+cnt)%mod;

        }



        return (int)(ans);
    }
}

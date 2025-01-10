public class DefanginganIpaddress {
    public static void main(String[] args) {
        String a="1.1.1.1";
        System.out.println(defangIPaddr(a));
    }

    public static String defangIPaddr(String address) {
        String b = "";

        for(int i=0;i<address.length();i++){
            if (address.charAt(i)=='.'){
                b+="[.]";
            }else{
                b+=address.charAt(i);
            }
        }
        return b;
    }
}

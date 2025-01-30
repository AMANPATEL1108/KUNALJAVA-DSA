public class Lengthoflastword {
    public static void main(String[] args) {
        String a="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(a));
    }
    public static int lengthOfLastWord(String s) {

        String c=s.strip();
        String[] newsplit=c.split( " ");

        int f=newsplit.length-1;

        String p = newsplit[f];
        int totallen=p.length();

        return totallen;
    }
}

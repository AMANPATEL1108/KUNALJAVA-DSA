public class EncodeandDecodeTinyURL {
    public static void main(String[] args){
        String a="https://leetcode.com/problems/design-tinyurl";
        System.out.println(encode(a));
        System.out.println(decode(a));
    }

    public static String encode(String longUrl) {
        return longUrl;

    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        return shortUrl;
    }
}

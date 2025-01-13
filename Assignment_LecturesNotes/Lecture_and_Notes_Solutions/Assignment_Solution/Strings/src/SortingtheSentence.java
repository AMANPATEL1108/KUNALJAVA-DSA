import java.util.ArrayList;

public class SortingtheSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(str));
    }

    public static String sortSentence(String s) {
        String word = "";
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            word += s.charAt(i);
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                arrayList.add(word.trim());
                word = "";
            }
        }

        String sentensmain = "";
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                int num1 = Integer.parseInt(arrayList.get(j).replaceAll("\\D", ""));
                int num2 = Integer.parseInt(arrayList.get(j + 1).replaceAll("\\D", ""));
                if (num1 > num2) {
                    String temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            sentensmain += arrayList.get(i).replaceAll("\\d", "") + " ";
        }

        return sentensmain.trim();
    }
}

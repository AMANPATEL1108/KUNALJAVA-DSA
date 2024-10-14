import java.util.List;

public class CountItemsMatchingaRule {

    public static void main(String[] args) {
        List<List<String>> items1 = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items1, ruleKey, ruleValue);
        System.out.println(result);
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                result++;
            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                result++;
            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                result++;
            }
        }

        return result;
    }
}

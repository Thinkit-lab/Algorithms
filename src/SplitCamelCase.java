import java.util.Arrays;

public class SplitCamelCase {

    static class Solution {
        public static String camelCase(String input) {
            String[] strArr = input.split("(?=\\p{Lu})");
            String result = String.join(" ", strArr);
            System.out.println(Arrays.toString(strArr));
            return result;
        }

        public static String camelCase2(String input) {
            StringBuilder stringBuilder = new StringBuilder(input);
            String result = "";
            for(int i=0; i<stringBuilder.length(); i++){
                    if(Character.isUpperCase(stringBuilder.charAt(i))){
                        result += " "+stringBuilder.charAt(i);
                    } else {
                        result += stringBuilder.charAt(i);
                    }
                }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.camelCase2("camelCasing"));
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class High {

        public static String high(String s) {
            String[] strArr = s.toLowerCase().split(" ");
//            int score = 0;
//            String result = "";
//            for (int i=0; i<strArr.length; i++) {
//                String eachString = strArr[i];
//                int eachCount = 0;
//                for(int j=0; j<eachString.length(); j++) {
//                    eachCount += eachString.charAt(j) - 96;
//                }
//                if (eachCount > score) {
//                    score = eachCount;
//                    result = strArr[i];
//                }
//            }
//            return result;
            return Arrays.stream(strArr).max(Comparator.comparingInt(eachString -> eachString.chars()
                    .map(value -> value - 96).sum())).get();
        }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }
}

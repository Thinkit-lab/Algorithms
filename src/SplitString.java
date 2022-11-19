import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String toSplit = "abc";
        if(toSplit.length() % 2 != 0){
            toSplit = toSplit + "_";
        }
        int n = toSplit.length()/2;
//        String[] splitted = new String[n];
        String[] splitted = toSplit.split("(?<=\\G.{2})");
//        for(int i = 0; i<n; i++){
//            splitted[i] = toSplit.substring(i*2, i*2 + 2);
//        }

        System.out.println(Arrays.toString(splitted));
    }
}
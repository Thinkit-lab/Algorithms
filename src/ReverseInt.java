//import java.util.Arrays;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(convertNum));
    }
    static int num = 1234;
    static String convertNum = Integer.toString(num);
    static String reverseInt(String convertNum){
        if(convertNum.length()==0) {
            return "";
        }
        return reverseInt(convertNum.substring(1)) + convertNum.charAt(0);
    }
}
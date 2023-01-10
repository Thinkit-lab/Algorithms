import java.util.Arrays;

public class ProdFib {

        public static long[] productFib(long prod) {
            int firstNum = 0;
            int secondNum = 1;
            int nextNum = firstNum + secondNum;
            StringBuilder fibSequence = new StringBuilder();
            fibSequence.append(firstNum);
            fibSequence.append(secondNum);
            while (fibSequence.length() < 15) {
                firstNum = fibSequence.charAt(fibSequence.length()-2);
                secondNum = fibSequence.length()-1;
                nextNum = firstNum + secondNum;
                fibSequence.append(nextNum);
            }
            System.out.println(fibSequence);
            // your code
            return null;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(20)));
    }
}

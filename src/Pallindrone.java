public class Pallindrone{

    public static void main(String[] args) {
        System.out.println(binaryAddition(2,6));
    }

    public static String binaryAddition(int a, int b){
        //your code here
        int sum = a + b;
        String binary = "";
        while (sum > 0){
            int remainder = sum%2;
            binary = remainder + binary;
            sum = sum / 2;
        }
//        StringBuilder str = new StringBuilder(binary);
//        str.reverse();
//        return str.toString();
        return binary;
    }
}
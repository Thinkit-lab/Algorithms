import java.util.Arrays;

public class BinaryConversion {
    public static void main(String[] args) {
        System.out.println(binaryConversion(1234));
        System.out.println(bitCount(1234));
        System.out.println(manualCount(1234));
        System.out.println(manualCount2(1234));
    }
    static int bitCount(int number){
       return Integer.bitCount(number);
    }
    static String binaryConversion(int n){
        return Integer.toBinaryString(n);
    }
    static int manualCount(int number){
        String[] binaryArray = binaryConversion(number).split("");
        int count = 0;
        String newArray = Arrays.toString(binaryArray);
        System.out.println(Arrays.toString(binaryArray));
        for(int i = 0; i<=binaryArray.length-1; i++){
            if(binaryArray[i] == "1"){
                count++;

            }
        }
        return count;
    }

    static int manualCount2(int number){
        int count = number % 2;
//        int num = number;
        while (number/2 > 0)
            count = count + number % 2;

        return count;
    }
}
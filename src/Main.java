import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(24,85,0));
        ArrayList<Integer> listArr = new ArrayList<>();
        listArr.add(1);
        listArr.add(2);
        listArr.add(3);
        listArr.add(4);
        listArr.add(5);
        listArr.add(6);
        listArr.add(7);
        listArr.add(8);
        System.out.println(Challenge2.packArray(listArr));
    }

    public static class Challenge {
        public static int arrayPacking(ArrayList<Integer> integers) {
            String number = "";
            for(Integer value : integers){
                number = Integer.toBinaryString(value) + number;
            }
            System.out.println(number);
            String[] numArr = number.split("");
//            int result = Integer.parseInt(number);
            System.out.println(Arrays.toString(numArr));
            int result = 0;
            for(int i=0; i<numArr.length; i++){
                result += Integer.parseInt(numArr[i]) * Math.pow(2, numArr.length -1-i);
            }

            return result;
        }

    }

    public static class CapitalAfterVowel {
        public static String capitalAfterVowel(String str){
            StringBuilder stringBuilder = new StringBuilder(str);
            for(int i=0; i<stringBuilder.length(); i++){
                if((stringBuilder.charAt(i) == 'a' || stringBuilder.charAt(i) == 'e' || stringBuilder.charAt(i) == 'i' || stringBuilder.charAt(i) == 'o' || stringBuilder.charAt(i) == 'u')) {
                    String value = String.valueOf(str.charAt(i+1)).toUpperCase();
                    stringBuilder.setCharAt(i+1, value.charAt(0));
                }
            }
            return stringBuilder.toString();
        }

    }

    public static class Challenge2 {
        public static int packArray(ArrayList<Integer> integers) {
            int result = 0;
//            int[] integerArr = Arrays.
            ArrayList<Integer> staticList = integers;
            for(int i=1; i<(staticList.size()/2); i++){
                ArrayList<Integer> arrayList = new ArrayList<>();
                if(i%2==0){
                    for(int j=0; j<integers.size()-1; j+=2){
                        int num1 = integers.get(j);
                        int num2 = integers.get(j+1);
                        int multiply = num1*num2;
                        arrayList.add(multiply);
                    }
                    integers = arrayList;
                }
                else{
                    for(int j=0; j<integers.size()-1; j+=2) {
                       int num1 = integers.get(j);
                       int num2 = integers.get(j+1);
                       int addition = num1+num2;
                        arrayList.add((addition));
                    }
                    integers =arrayList;
                }
                if(arrayList.size()==1){
                    result = arrayList.get(0);
                }
            }

            return result;
        }
    }
}
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Kata3 kata3 = new Kata3();
        Challenge5 challenge = new Challenge5();
        Solution2 solution = new Solution2();
        System.out.println(challenge.autocorrect("We have sent the deliverables to you."));

    }
}

    class Kata3 {

    public int[] arrayDiff(int[] a, int[] b) {
        int count = 0;
        for(int i=0; i<a.length; i++){
            int singleCount = 0;
            for(int j=0; j<b.length; j++){
                if(a[i] != b[j]){
                    singleCount+=1;
                }
            }
            if(singleCount >= 1){
                count+=1;
            }
        }
        int[] result = new int[count];
        int idx =0;
        if(a.length>=b.length){

            for(int i=0; i<a.length; i++){
                int occurrence = 0;
                for(int j=0; j<b.length; j++){
                    if(a[i] == b[j]){
                        occurrence++;
                    }
                }
                if(occurrence ==0){
                    result[idx] = a[i];
                    idx+=1;
                }
            }
        }
        else {
            for(int i=0; i<b.length; i++){
                int occurrence = 0;
                for(int j=0; j<a.length; j++){
                    if(b[i] == a[j]){
                        occurrence++;
                    }
                }
                if(occurrence ==0){
                    result[idx] = b[i];
                    idx+=1;
                }
            }
        }

        return result;
    }
    }

class Challenge3 {
    public static String numberToOrdinal(Integer number) {
        String str = number.toString();
        if(number >= 11 && number <=19){
            return str +"th";
        } else if (str.charAt(str.length()-1) == '1') {
            return str + "st";

        }
        else if (str.charAt(str.length()-1) == '2') {
            return str + "nd";

        }
        else if (str.charAt(str.length()-1) == '3') {
            return str + "rd";

        }

        return str + "th";
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexSum = new int[2];
        for(int i=0; i<nums.length-1; i++){

                for(int j=i+1; j< nums.length; j++){
                    int sum = nums[i];
                    sum+=nums[j];

                    if(sum == target){
                        indexSum[0] = i;
                        indexSum[1] = j;
                    }
                }



        }
        return indexSum;
    }
}

class Solution2 {
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<digits.length; i++){
            if(i == digits.length-1){
                digits[i]+=1;
            }
            stringBuilder.append(digits[i]);
        }
        System.out.println(stringBuilder);
        int[] mod = new int[stringBuilder.length()];
        for(int i =0; i<stringBuilder.length(); i++){
            mod[i] = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));

        }
        return  (mod);
    }
}

class Challenge4 {
    public List<Integer> splitInteger(int num, int parts) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<parts; i++){
            if(num%parts == 0){
                result.add(num/parts);
            }
        }
        for(int i=0; i<parts; i++){
            if(num%parts != 0){
                result.add(num/parts);
                num = num-(num/parts);
                parts = parts-1;
            }
//         else{
//           result.add(num/parts);
//         }
        }
        return result;
    }
}

class Challenge5 {
    public String autocorrect(String input) {
        String inputLower = input.toLowerCase();
        String[] splitstr = input.split(" ");
        String newInput = "";
        for(String str : splitstr){
            if(Objects.equals(str, "you.")){
                str = "your client.";
            }
            newInput = newInput + " " +str;
        }

        return newInput.trim();
    }
}


import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Kata3 kata3 = new Kata3();
        Challenge3 challenge = new Challenge3();
        Solution2 solution = new Solution2();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{4, 3, 9})));

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
        int[] mod = new int[digits.length];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<digits.length; i++){
            if(i == digits.length-1){
                digits[i]+=1;
            }
            mod[i] = digits[i];
            stringBuilder.append(digits[i]);
        }
        System.out.println(Arrays.toString(Arrays.stream(Arrays.stream(mod).toArray()).distinct().toArray()));
        char str = stringBuilder.charAt(stringBuilder.length()-1);



//        String str = mod.toString().split("");
//        String
//        int[] result = new int[];

        System.out.println(stringBuilder.length());
        System.out.println(Arrays.toString(mod));
        return  null;
    }
}

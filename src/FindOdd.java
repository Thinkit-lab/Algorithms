import java.util.*;
import java.util.stream.Collectors;

public class FindOdd {

        public static int findIt(int[] a) {
            TreeSet<Integer> integerSet = new TreeSet<>();
            for (int value : a){
                integerSet.add(value);
            }
            for (Integer setval : integerSet) {
                int count = 0;
                for (int intval : a) {
                    if (setval.equals(intval)) {
                        count++;
                    }
                }
                if (count%2 != 0) {
                    return setval;
                }
            }
//            integerSet.forEach(System.out::println);
            return 0;
        }

        public static int findIt2(int[] A) {
            int xor = 0;
            for (int i = 0; i < A.length; i++) {
                xor ^= A[i];
            }
            return xor;
        }


    public static void main(String[] args) {
        System.out.println(findIt2(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
//        int result = 2;
//        result ^= 3;
//        System.out.println(result);
    }
}

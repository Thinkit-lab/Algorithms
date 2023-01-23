import java.util.*;

public class AlgoTobi {
    public static void main(String[] args) {

//        int[] input1 = {1, 2, 3, 4, 5};
//        int[] input2 = {1, 4, 5, 4, 5};
//        int output1 = maxMarks(1, input1);
//        int output2 = maxMarks(1, input2);
//        System.out.println("For input1: " + Arrays.toString(input1) + " the minimum total marks are " + output1);
//        System.out.println("For input2: " + Arrays.toString(input2) + " the minimum total marks are " + output2);

        System.out.println(maxmarks(5, new int[]{1, 4, 5, 5, 4}));
    }
    public static int[] altTab(int num1, int num2, int[] arr) {
        int[] result = new int[arr.length];
        for (int i=0; i< arr.length; i++ ) {
            if(i == num2){
                result[0] = arr[i];
            } else {
                result[i+1] = arr[i];
            }
        }
        return result;
    }

    public static int maxmarks(int input1, int[] input2) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> setList = new ArrayList<>();
        setList.forEach(System.out::println);
        int setListSum = 0;
        int setSum = 0;
        for (int setVal : input2) {
            set.add(setVal);
        }
        for (Integer s : set) {
            setList.add(s);
        }
        int count = 0;
        for (Integer set1 : set) {
            for (int j=1; j<input2.length; j++) {
                if(set1 == input2[j]) {
                    count++;
                }
            }
            if(count>1) {
                int newVal = setList.get(setList.size()-1) + 1;
                setListSum += newVal;
                setList.add(newVal);
            }
        }
        for (Integer setItem: set) {
            setSum+=setItem;
        }

        int result = setSum + setListSum;


        return result;
    }





        public static int maxMarks(int input1, int[] input2) {
            Set<Integer> usedMarks = new HashSet<>();
            int totalMarks = 0;
            for (int mark : input2) {
                int maxMark = Math.max(mark, input1);
                while (usedMarks.contains(maxMark)) {
                    maxMark++;
                }
                usedMarks.add(maxMark);
                totalMarks += maxMark;
                input1 = maxMark;
            }
            return totalMarks;
    }
    }

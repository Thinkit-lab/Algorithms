public class NextGreatestLetter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f', 'j'}, 'c'));
//        System.out.println(1%3);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target > letters[mid]) {
                start = mid + 1;
            }else if (target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}

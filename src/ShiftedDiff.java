public class ShiftedDiff {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee", "eecoff"));
    }

    public static int shiftedDiff(String first, String second) {
        int temp = 0;
        int count = 0;
        for(int i = first.length(); i>=0; i--) {
            String result ="";
            result+=first.substring(i, first.length()) + first.substring(0, i);
            count++;
            if (result.equals(second)) {
                temp = count;
                return temp;
            }
        }

        return -1;
    }

}

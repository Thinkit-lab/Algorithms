import java.util.Arrays;

class Kata {
    public int findEvenIndex(int[] arr) {

        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(i==0){
                int sumLeft = 0;
                int sumRight = 0;
                for(int j=1; j<arr.length; j++){
                    sumRight+= arr[j];
                }
                if(sumRight==sumLeft){
                    index = i;
                    return index;
                }

            }
//            return  index;
            else if(i>0)
            {
                int sumLeft = 0;
                int sumRight = 0;
                for(int j=0; j< arr.length; j++){
                    if(j<i){
                        sumLeft += arr[j];
                    }
                    else if (j>i){
                        sumRight+=arr[j];
                    }
                    else if (j==i){
                        sumLeft+=0;
                        sumRight+=0;
                    }
                }
                if(sumRight==sumLeft){
                    index = i;
                    return index;
                }

            }

        }
        return -1;
        // your code
    }
}

class Kata2 {
    public static int findEvenIndex(int[] arr) {
        int left = 0;
        int right = Arrays.stream(arr).sum();
        for (int i=0; i<arr.length; i++){
            right -= arr[i];
            if (left == right) return i;
            left += arr[i];
        }
        return -1;
    }
}

public class BoilerPlate {
    public static void main(String[] args) {
        Kata2 obj = new Kata2();

        System.out.println(obj.findEvenIndex(new int[]{20,10,-80,10,10,15,35}));
    }
}
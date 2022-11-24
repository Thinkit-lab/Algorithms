import java.util.ArrayList;
import java.util.List;

public class Outlier {
    public static void main(String[] args) {
        FindOutlier result = new FindOutlier();
        System.out.println(result.find(new int[]{160, 3, 1719, 19, 11, 13, -21}));
    }
}

class FindOutlier{
    int find(int[] integers){
        List<Integer> oddIntegers = new ArrayList<>();
        List<Integer> evenIntegers = new ArrayList<>();
        for(int i=0; i<integers.length; i++){
            if(integers[i]%2 == 0){
                evenIntegers.add(integers[i]);
            }
            else{
                oddIntegers.add(integers[i]);
            }
        }
        if(oddIntegers.size() == 1){
            return oddIntegers.get(0);
        }
        else if (evenIntegers.size()==1){
            return evenIntegers.get(0);
        }

        return 0;
    }
}
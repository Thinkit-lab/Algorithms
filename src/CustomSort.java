import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        Sort obj = new Sort();
        System.out.println(obj.sort());

    }
}

class Sort{
    List<Integer> value = new ArrayList<>();
    public List<Integer> sort(){

        value.add(423);
        value.add(641);
        value.add(147);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }
                return -1;
            }
        };

        Iterator<Integer> iterate = value.iterator();
        for(Integer val : value){
            System.out.println(iterate.next());
        }
        Collections.sort(value, c);


        return value;
    }

    void iterator(){

    }



}
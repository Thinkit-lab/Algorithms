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


        Iterator<Integer> iterate = value.iterator();
        for(Integer val : value){
            System.out.println(iterate.next());
        }
//        Collections.sort(value, (Integer o1, Integer o2) -> (o1%10 > o2%10)?1:-1);
        Collections.sort(value, (o1,o2)->(o1%100>o2%100)?1:-1);


        return value;
    }
}

class Studs{
    int rollNo, age;
    String name;

    public Studs(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studs{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
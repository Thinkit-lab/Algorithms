import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ClassObjectSort {
    public static void main(String[] args) {
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(1,"Olukunle Afolabi", 30));
        studs.add(new Students(4,"Ijedibia Daniel", 28));
        studs.add(new Students(2,"Oladele Tobi", 37));
        studs.add(new Students(3,"Idowu Thompson", 34));

        Collections.sort(studs, (i,j)->(i.age>j.age)?1:-1);
        for(Students s : studs){
            System.out.println(s);
        }
    }
}

class Students implements Comparable<Students>{
    int rollNo, age;
    String name;

    public Students(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return (rollNo>o.rollNo)?1:-1;
    }
}

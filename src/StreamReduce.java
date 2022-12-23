
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        list.add(new Employe("Dave", 23,20000));
        list.add(new Employe("Joe", 18,40000));
        list.add(new Employe("Ryan", 54,100000));
        list.add(new Employe("Iyan", 5,34000));
        list.add(new Employe("Ray", 63,54000));

        Optional<Integer> totalSalary = list.stream()
                .map(Employe::getSalary)  //We are converting the Stream of Employees to Stream of salaries.
                .reduce((p,q) -> p + q);

        totalSalary.ifPresent(integer -> System.out.println("The total salary is " + integer));
    }
}

class Employe {
    String name;
    int age;
    int salary;

    Employe(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
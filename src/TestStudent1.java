class Student{
    int id;
    String name;
}

public class TestStudent1{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name + s1.id);
    }
}
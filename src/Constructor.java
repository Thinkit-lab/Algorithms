class Employee{
    String name;
    int age;
    String role;

    void insert(String n, int a, String r){
        name = n;
        age = a;
        role = r;
    }

    void display(){
        System.out.println("Employee name is " + name + " age is " + age + " and a " + role);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert("Olukunle Afolabi", 27, "Software Engineer");
        e2.insert("Eluyeni Oyindamola", 25, "Frontend Developer");
        e3.insert("Olukunle Afolabi", 27, "Software Engineer");
        e1.display();
        e2.display();
        e3.display();
    }
}
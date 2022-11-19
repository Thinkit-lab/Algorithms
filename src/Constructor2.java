class Parent{
    String name;
    int age;

    Parent(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent{
    float salary;
    Child(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }
    void display(){
        System.out.println("Name is " + name + " Salary is " + salary + " Age is " + age);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Child e1 = new Child("Olukunle Afolabi", 27, 50000);
        e1.display();
    }
}
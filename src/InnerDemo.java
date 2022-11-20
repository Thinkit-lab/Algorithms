class Outer{
    void display(){
        System.out.println("Outer Class");
    }

    static class Inner{
        void display(){
            System.out.println("Inner Class");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer c = new Outer();
        c.display();

        Outer.Inner c2 = new Outer.Inner();
        c2.display();

    }
}

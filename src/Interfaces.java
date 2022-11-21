interface Shape{
    public void draw();
    public double getArea();
}

class Circle implements Shape{
    private double radius;
    public void radius(double radius){
        this.radius = radius;
    }
    public void draw(){
        System.out.println("Draw Circle");
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.radius(5);
        c.draw();
        System.out.println(c.getArea() + c.getRadius());
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid();
        cuboid1.length = 5;
        cuboid1.breadth = 10;
        cuboid1.height = 15;

        Cuboid cuboid2 = new Cuboid();
        cuboid2.length = 2;
        cuboid2.breadth = 4;
        cuboid2.height = 6;

        Cuboid cuboid3 = new Cuboid();
        cuboid3.length = 3;
        cuboid3.breadth = 12;
        cuboid3.height = 15;

        Sphere sphere1 = new Sphere();
        sphere1.radius = 5;

        Sphere sphere2 = new Sphere();
        sphere2.radius = 2;

        Sphere sphere3 = new Sphere();
        sphere3.radius = 3;

        Geo_Objects[] geo_objects = new Geo_Objects[6];
        geo_objects[0] = cuboid1;
        geo_objects[1] = cuboid2;
        geo_objects[2] = cuboid3;
        geo_objects[3] = sphere1;
        geo_objects[4] = sphere2;
        geo_objects[5] = sphere3;

        Application application = new Application();
        double vol = application.getTotalVolume(geo_objects);

        System.out.println("The total volume is " + vol);

    }
}

abstract class Geo_Objects{
    abstract double get_volume();
}
class Cuboid extends Geo_Objects{
    int length;
    int breadth;
    int height;

    @Override
    double get_volume() {
        return length*breadth*height;
    }
}
class Sphere extends Geo_Objects{
    int radius;

    @Override
    double get_volume() {
        return (4/3) * Math.PI*radius*radius*radius;
    }
}
class Application{
    public double getTotalVolume(Geo_Objects[] geo_objects){
        double vol_sum = 0;
        for(Geo_Objects obj : geo_objects){
            vol_sum += obj.get_volume();
        }
        return vol_sum;
    }
}
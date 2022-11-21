interface sport{
    void play();
}

class Badminton implements sport{
    public void play(){
        System.out.println("Playing Badminton");
    }
}
class Football implements sport{
    public void play(){
        System.out.println("Playing Football");
    }
}

public class SportInterface {
    public static void main(String[] args) {
    sport s = new Badminton();
    sport s1 = new Football();
    s.play();
    s1.play();
    }
}

public class ObjectAndClass {
    public static void main(String[] args) {
        SimpleAddition sum = new SimpleAddition(5, 10);
        SimpleAddition sum2 = new SimpleAddition(20,30);
//        sum.insert(5, 10);
        System.out.println(sum.displayResult());
        System.out.println(sum2.displayResult());
    }
}

class SimpleAddition{
    int a, b, result;
    static int c;

    static {
        c = 25;
    }

    public SimpleAddition(int a, int b){
        this.a = a;
        this.b = b;
    }

    void insert(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int displayResult(){
        result = a + b + c;
        return result;
    }
}

public class Array {
    public static void main(String[] args) {
        Calc sum = new Calc();
        System.out.println(sum.sum(2,5,7));

    }
}

class Calc{
    static int sum = 0;
    int sum(int ... i){
        for(int num : i){
            sum+=num;
        }
        return sum;
    }
}
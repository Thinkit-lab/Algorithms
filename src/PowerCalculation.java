public class PowerCalculation {
    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.power(1000,0));
    }
}
class Power{
    int power(int a, int b){
        int result = a;
        if(b != 0){
            for (int i=1; i<b; i++){
                result *= a;
            }
            return result;
        }else{
            return 1;
        }
    }
}
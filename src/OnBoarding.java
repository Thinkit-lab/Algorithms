public class OnBoarding {
    public static void main(String[] args) {
        BreakChocolate breakChocolate = new BreakChocolate();
        System.out.println(breakChocolate.breakChocolate(5,5));
    }


}

class BreakChocolate{
    public int breakChocolate(int n, int m){
        int count =0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                count++;
            }
        }
        return count-1;
    }
}

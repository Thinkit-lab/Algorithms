import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        Challenge1 challenge1 = new Challenge1();
        System.out.println(challenge1.withdraw(230));

    }
}

class Challenge1 {
    public ArrayList<Integer> withdraw(int amount) {
        int numberOfHundred = 0;
        int numberOfFifty = 0;
        int numberOfTwenty = 0;
        int currentAmount = amount;
        while((currentAmount >= 100 && currentAmount-100>50)){
            numberOfHundred++;
            currentAmount-=100;
        }
        while(currentAmount >= 50 && currentAmount-50>20 && (currentAmount-50)%20==0){
            numberOfFifty++;
            currentAmount -= 50;
        }
        while(currentAmount >= 20){
            numberOfTwenty++;
            currentAmount -= 20;
        }

        return new ArrayList<Integer>(Arrays.asList(numberOfHundred, numberOfFifty, numberOfTwenty));
    }
}

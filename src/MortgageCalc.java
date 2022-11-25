import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        System.out.println("Mortgage: " + mortgage.mortgage());

    }
}

class Mortgage{
    String mortgage(){
        System.out.print("Principal: ");
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();
        double monthlyRate = (annualRate/100)/12;
        System.out.print("Period (Years): ");
        int periodInYears = input.nextInt();
        int periodInMonths = periodInYears*12;
        double c = Math.pow((1+monthlyRate),periodInMonths);
        double mortgageValue = principal * ((monthlyRate * c) / (c - 1)) ;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgageValue);

        return mortgageFormatted;
    }
}

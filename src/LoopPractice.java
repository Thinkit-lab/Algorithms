public class LoopPractice {
    public static void main(String[] args) {
//        printLetters();
//        printInNumbers();
        dollarBox();
    }
    static void printInNumbers(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void printLetters(){
        for(char i=65; i<=67; i++){
            for(char j=65; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void dollarBox(){
        int length = 5;
        for(int i=0; i<length; i++){
            if(i == 0 || i == length-1){
                for(int j=0; j<length; j++) {
                    System.out.print("$ ");
                }
            }
            else {
                for(int j=0; j<length; j++) {
                    if(j==0 || j==length-1) {
                        System.out.print("$ ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
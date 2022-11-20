public class PopulationGrowth {
    public static void main(String[] args) {
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
    }


        public static int nbYear(int p0, double percent, int aug, int p) {
            int currentPopulation = p0;
            int years = 0;
            while(currentPopulation < p){
                years+=1;
                currentPopulation = currentPopulation + (int)(0.01*percent*currentPopulation) + aug;
            }
            return years; // your code
    }
}



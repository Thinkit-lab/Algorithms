public class new1 {
    public static void main(String[] args) {
        System.out.println(dnaComplement("A"));
    }

        public static String dnaComplement(String dna) {
        String result = dna;
            if(dna == "" || dna==null) {
                return "";
            }
            for(int i=0; i<dna.length(); i++) {
                if(dna.charAt(i) == 'A') {
                    result= dna.replace('A', 'T');
                } else if(dna.charAt(i)== 'T') {
                    result = dna.replace('T', 'A');
                } else if(dna.charAt(i)== 'C') {
                    result= dna.replace('C', 'G');
                } else if(dna.charAt(i)== 'G') {
                    result=dna.replace('G', 'C');
                }
            }
            return result;
        }

}

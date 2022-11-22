//import java.util.Arrays;

import java.util.Arrays;

public class CountingDuplicate {
    public static void main(String[] args) {
        Duplicate result = new Duplicate();
        System.out.println(result.duplicate("46ffg6edsdg"));

    }
}

class Duplicate{
    public int duplicate(String word){
         int count = 0;
        char[] wordArr = word.toLowerCase().toCharArray();
        System.out.println(wordArr);
        for(int i=0; i<word.length(); i++){
            int singleCount = 0;
            for(int j=i; j<word.length(); j++){
                if(wordArr[i]==wordArr[j]){
                    singleCount = singleCount;
                }

                else if(wordArr[i]==wordArr[j]) {
                    singleCount += 1;

                }
            }
            if(singleCount>1){
                count+=1;
            }

        }
        return count;
    }
}

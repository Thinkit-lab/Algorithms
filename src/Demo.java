import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Kata3 kata3 = new Kata3();
        System.out.println(Arrays.toString(kata3.arrayDiff(new int[]{1,2,2,2,3}, new int[]{2})));

    }
}

    class Kata3 {

    public int[] arrayDiff(int[] a, int[] b) {
        int count = 0;
        for(int i=0; i<a.length; i++){
            int singleCount = 0;
            for(int j=0; j<b.length; j++){
                if(a[i] != b[j]){
                    singleCount+=1;
                }
            }
            if(singleCount >= 1){
                count+=1;
            }
        }
        int[] result = new int[count];
        int idx =0;
        if(a.length>=b.length){

            for(int i=0; i<a.length; i++){
                int occurrence = 0;
                for(int j=0; j<b.length; j++){
                    if(a[i] == b[j]){
                        occurrence++;
                    }
                }
                if(occurrence ==0){
                    result[idx] = a[i];
                    idx+=1;
                }
            }
        }
        else {
            for(int i=0; i<b.length; i++){
                int occurrence = 0;
                for(int j=0; j<a.length; j++){
                    if(b[i] == a[j]){
                        occurrence++;
                    }
                }
                if(occurrence ==0){
                    result[idx] = b[i];
                    idx+=1;
                }
            }
        }

        return result;
    }
    }

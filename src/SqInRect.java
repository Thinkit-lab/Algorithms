import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SqInRect {
        public static List<Integer> sqInRect(int lng, int wdth) {
            List<Integer> result = new ArrayList<>();
//            if(lng != wdth){
//                while (lng != wdth){
//                    if(lng > wdth && wdth !=1){
//                        result.add(wdth);
//                        lng = lng - wdth;
//                    } else if (lng < wdth && lng !=1) {
//                        result.add(lng);
//                        wdth = wdth - lng;
//                    }
//                    if (lng < wdth){
//                        result.add(lng);
//                        wdth = wdth - lng;
//                    } else if (lng > wdth) {
//                        result.add(wdth);
//                        lng = lng - wdth;
//                    }
//                    if (lng == wdth){
//                        result.add(lng);
//                    }
//                    if(lng > wdth && wdth ==1){
//                        for (int i=0; i<lng; i++){
//                            result.add(wdth);
//                        }
//                        break;
//                    } else if (lng < wdth && lng ==1) {
//                        for (int i=0; i<wdth; i++){
//                            result.add(lng);
//                        }
//                        break;
//                    }
//                }
//                    return result;
//            }
            if(lng != wdth) {
                while (lng !=0) {
                    result.add(Math.min(lng, wdth));
                    if(lng > wdth) lng -= wdth;
                    else if(lng < wdth) wdth -= lng;
                    else lng = 0;
                }
                return result;
            }
            return null;
        }

    public static void main(String[] args) {
        Objects.requireNonNull(sqInRect(62, 34)).forEach(System.out::println);
        System.out.println("The minimium is: " + Math.min(1,1));
    }
    }


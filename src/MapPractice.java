import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> obj = new HashMap<>();
        obj.put("name", "Olukunle Afolabi");
        obj.put("actor", "John Doe");
        obj.put("ceo", "Chika Nwobi");

        Set<String> keys = obj.keySet();

        for(String key : keys){
            System.out.println(key +" " + obj.get(key));
        }
    }
}

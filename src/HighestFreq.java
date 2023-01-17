import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestFreq {

        public static int frequencyMap(String[] elements) {
//            return Arrays.stream(elements).collect(
//                    Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                    Collectors.groupingBy(
//                            Function.identity(),
//                            HashMap::new, // can be skipped
//                            Collectors.counting()
//                    )
//            )
            return 0;
        }

        public static void main( String args[] ) {
            List<String> words = Arrays.asList("hello", "hello", "mighty");
//            System.out.println(frequencyMap(words.stream()));
        }

}

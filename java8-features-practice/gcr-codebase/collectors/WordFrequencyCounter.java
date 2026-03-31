import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String para = "java is easy and java is powerful";
        Map<String, Integer> wordCount =
                Arrays.stream(para.split(" "))
                      .collect(Collectors.toMap(
                          word -> word, // key
                          word -> 1, // initial value
                          Integer::sum // merge duplicates
                      ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " : " + count)
        );
    }
}

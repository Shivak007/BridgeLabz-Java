package javacollectionsandstreams.java8features.day7;
import java.util.*;
import java.util.stream.*;

public class MostFrequentWords {
    public static void main(String[] args) {

        String text = "java stream lambda java stream java api";

        Map<String, Long> freq =
                Arrays.stream(text.toLowerCase().split("\\W+"))
                        .collect(Collectors.groupingBy(
                                w -> w,
                                Collectors.counting()));

        freq.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));
    }
}

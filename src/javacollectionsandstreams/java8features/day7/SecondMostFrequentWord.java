package javacollectionsandstreams.java8features.day7;
import java.util.*;
import java.util.stream.*;

public class SecondMostFrequentWord {
    public static void main(String[] args) {

        String text = "java stream lambda java stream java api api";

        Map<String, Long> freq =
                Arrays.stream(text.split("\\W+"))
                        .collect(Collectors.groupingBy(
                                w -> w,
                                Collectors.counting()));

        Optional<Map.Entry<String, Long>> second =
                freq.entrySet().stream()
                        .sorted((a, b) ->
                                Long.compare(b.getValue(), a.getValue()))
                        .skip(1)
                        .findFirst();

        second.ifPresent(e ->
                System.out.println("Second most frequent: "
                        + e.getKey() + " = " + e.getValue()));
    }
}

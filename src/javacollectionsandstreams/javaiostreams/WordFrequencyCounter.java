package javacollectionsandstreams.javaiostreams;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "data/javaiostreams/wordcount/text.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        System.out.println("Top 5 most frequent words:");

        wordCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(5)
                .forEach(e ->
                        System.out.println(e.getKey() + " : " + e.getValue())
                );
    }
}

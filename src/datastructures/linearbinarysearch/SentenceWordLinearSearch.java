package datastructures.linearbinarysearch;

public class SentenceWordLinearSearch {
    public static void main(String[] args) {
        String[] sentences = {"Java is good", "I love coding", "Data structures"};
        String target = "coding";

        for (String s : sentences) {
            if (s.contains(target)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}

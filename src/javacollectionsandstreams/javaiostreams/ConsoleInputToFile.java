package javacollectionsandstreams.javaiostreams;
import java.io.*;

public class ConsoleInputToFile {

    public static void main(String[] args) {

        String outputPath = "data/javaiostreams/consoleinput/user.txt";

        try (
                BufferedReader br =
                        new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter(outputPath, true)
        ) {

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            String age = br.readLine();

            System.out.print("Enter favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + language + "\n");
            fw.write("----------------------\n");

            System.out.println("User details saved successfully");

        } catch (IOException e) {
            System.out.println("Error writing user details");
        }
    }
}

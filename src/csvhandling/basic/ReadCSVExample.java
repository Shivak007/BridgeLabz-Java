package csvhandling.basic;
import java.io.*;

public class ReadCSVExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\students.csv"));

        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println("ID: " + data[0] +
                    " Name: " + data[1] +
                    " Age: " + data[2] +
                    " Marks: " + data[3]);
        }
        br.close();
    }
}


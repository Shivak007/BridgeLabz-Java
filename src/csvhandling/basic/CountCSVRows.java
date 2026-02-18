package csvhandling.basic;
import java.io.*;

public class CountCSVRows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\students.csv"));
        br.readLine();
        int count = 0;

        while (br.readLine() != null) count++;

        System.out.println("Total records: " + count);
        br.close();
    }
}


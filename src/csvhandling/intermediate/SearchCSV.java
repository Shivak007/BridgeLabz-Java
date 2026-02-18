package csvhandling.intermediate;
import java.io.*;

public class SearchCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\employees.csv"));
        br.readLine();

        String search = "Shiva";
        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].equalsIgnoreCase(search))
                System.out.println("Dept: " + data[2] + " Salary: " + data[3]);
        }
        br.close();
    }
}


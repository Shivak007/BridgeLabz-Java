package csvhandling.intermediate;
import java.io.*;

public class FilterCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (Integer.parseInt(data[3]) > 80)
                System.out.println(line);
        }
        br.close();
    }
}


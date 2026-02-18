package csvhandling.intermediate;
import java.io.*;

public class UpdateCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\output\\updated.csv"));

        String line = br.readLine();
        bw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[2].equals("IT")) {
                double salary = Double.parseDouble(data[3]);
                salary *= 1.10;
                data[3] = String.valueOf(salary);
            }

            bw.write(String.join(",", data) + "\n");
        }

        br.close();
        bw.close();
    }
}

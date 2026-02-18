package csvhandling.intermediate;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class SortCSV {
    public static void main(String[] args) throws Exception {

        List<String[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\employees.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null)
            list.add(line.split(","));

        list.stream()
                .sorted((a,b) -> Double.compare(
                        Double.parseDouble(b[3]),
                        Double.parseDouble(a[3])))
                .limit(5)
                .forEach(a -> System.out.println(String.join(",", a)));

        br.close();
    }
}

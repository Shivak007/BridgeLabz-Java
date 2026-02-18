package csvhandling.advanced;
import java.io.*;

public class GenerateCSVFromDB {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\output\\report.csv"));
        bw.write("Employee ID,Name,Department,Salary\n");
        bw.write("1,Alice,IT,60000\n");
        bw.close();
    }
}

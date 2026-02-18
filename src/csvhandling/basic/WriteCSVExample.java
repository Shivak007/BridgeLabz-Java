package csvhandling.basic;
import java.io.*;

public class WriteCSVExample {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Shiva,IT,60000\n");
        bw.write("2,Naveen,HR,50000\n");
        bw.write("3,Jason,Finance,70000\n");
        bw.write("4,Hrithik,IT,65000\n");
        bw.write("5,Kushal,Marketing,55000\n");

        bw.close();
    }
}

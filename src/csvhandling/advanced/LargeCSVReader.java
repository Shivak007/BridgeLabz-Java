package csvhandling.advanced;
import java.io.*;

public class LargeCSVReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\large.csv"));
        br.readLine();

        int count = 0;
        String line;

        while((line=br.readLine())!=null){
            count++;
            if(count % 100 == 0)
                System.out.println("Processed: " + count);
        }

        br.close();
    }
}

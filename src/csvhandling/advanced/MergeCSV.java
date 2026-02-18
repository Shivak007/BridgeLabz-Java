package csvhandling.advanced;
import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {

        Map<String,String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\student1.csv"));
        br1.readLine();
        String line;

        while((line=br1.readLine())!=null){
            String[] d=line.split(",");
            map.put(d[0], d);
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\input\\student2.csv"));
        br2.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\output\\merged.csv"));
        bw.write("ID,Name,Age,Marks,Grade\n");

        while((line=br2.readLine())!=null){
            String[] d=line.split(",");
            String[] s1 = map.get(d[0]);

            bw.write(s1[0]+","+s1[1]+","+s1[2]+","+d[1]+","+d[2]+"\n");
        }

        br2.close();
        bw.close();
    }
}

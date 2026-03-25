package jsondata;
import java.io.*;
import com.fasterxml.jackson.databind.*;
import java.util.*;

public class CsvToJson {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data/csv/input/students.csv"));
        List<Map<String,String>> list = new ArrayList<>();

        String[] headers = br.readLine().split(",");
        String line;

        while((line=br.readLine())!=null){
            String[] values=line.split(",");
            Map<String,String> map=new HashMap<>();

            for(int i=0;i<headers.length;i++)
                map.put(headers[i],values[i]);

            list.add(map);
        }

        ObjectMapper mapper=new ObjectMapper();
        System.out.println(mapper.writeValueAsString(list));
    }
}
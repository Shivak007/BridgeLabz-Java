package csvhandling.advanced;
import java.io.*;
import java.util.*;

public class JsonToCSV {

    public static void main(String[] args) throws Exception {

        String json = "[{\"id\":1,\"name\":\"Shiva\"},{\"id\":2,\"name\":\"Jason\"}]";

        json = json.replace("[","").replace("]","");
        String[] objects = json.split("},");

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\BridgeLabz-Java\\data\\csv\\output\\output.csv"));
        bw.write("id,name\n");

        for(String obj:objects){
            obj=obj.replace("{","").replace("}","");
            String[] fields=obj.split(",");
            String id=fields[0].split(":")[1];
            String name=fields[1].split(":")[1].replace("\"","");
            bw.write(id+","+name+"\n");
        }
        bw.close();
    }
}

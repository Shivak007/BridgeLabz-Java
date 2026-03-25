package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {

    public static void main(String[] args) throws Exception {

        String json = """
        {
          "id": 101,
          "name": "Aarav",
          "age": 22
        }
        """;

        ObjectMapper jsonMapper = new ObjectMapper();
        Object obj = jsonMapper.readValue(json, Object.class);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(obj);

        System.out.println(xml);
    }
}
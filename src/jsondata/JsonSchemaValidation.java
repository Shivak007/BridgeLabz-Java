package jsondata;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;

import java.util.Set;

public class JsonSchemaValidation {

    public static void main(String[] args) throws Exception {

        String schemaStr = """
        {
          "type": "object",
          "properties": {
            "email": {
              "type": "string",
              "format": "email"
            }
          },
          "required": ["email"]
        }
        """;

        String jsonStr = """
        {
          "email": "test@example.com"
        }
        """;

        ObjectMapper mapper = new ObjectMapper();

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaStr);

        JsonNode json = mapper.readTree(jsonStr);

        Set<ValidationMessage> errors = schema.validate(json);

        if (errors.isEmpty()) {
            System.out.println("Valid JSON");
        } else {
            errors.forEach(System.out::println);
        }
    }
}
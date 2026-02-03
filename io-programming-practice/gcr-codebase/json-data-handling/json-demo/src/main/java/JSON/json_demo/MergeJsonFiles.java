package JSON.json_demo;

import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {

	public static void main(String[] args) throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("D:\\\\BridgeLabz-Training\\\\io-programming-practice\\\\gcr-codebase\\\\json-data-handling\\\\json-demo\\\\src\\\\main\\\\java\\JSON\\json_demo\\user2.json"));
        JsonNode json2 = mapper.readTree(new File("D:\\\\BridgeLabz-Training\\\\io-programming-practice\\\\gcr-codebase\\\\json-data-handling\\\\json-demo\\\\src\\\\main\\\\java\\JSON\\json_demo\\user3.json"));

        ObjectNode merged = mapper.createObjectNode();

        merged.setAll((ObjectNode) json1);
        merged.setAll((ObjectNode) json2);

        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
        System.out.println(result);

	}

}
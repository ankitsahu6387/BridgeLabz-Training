package JSON.json_demo;
import org.json.JSONObject;
import org.json.JSONArray;
public class CreateStudentJSONObject {
	public static void main(String[] args) {

        JSONArray skills = new JSONArray();
        skills.put("Java");
        skills.put("SQL");
        skills.put("Spring");

        JSONObject emp = new JSONObject();
        emp.put("id", 101);
        emp.put("name", "Ankit");
        emp.put("salary", 45000);
        emp.put("skills", skills);

        System.out.println(emp.toString());
    }
}

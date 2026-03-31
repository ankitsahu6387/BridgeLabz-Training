import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";

    // Optional getter for verification
    public static String getApiKey() {
        return API_KEY;
    }
}

public class ModifyStaticField {

    public static void main(String[] args) {
        try {
            // Access the private static field "API_KEY"
            Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");

            // Make it accessible
            apiKeyField.setAccessible(true);

            // Modify the static field (null for static)
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Retrieve the updated value
            String updatedKey = (String) apiKeyField.get(null);
            System.out.println("Updated API_KEY: " + updatedKey);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
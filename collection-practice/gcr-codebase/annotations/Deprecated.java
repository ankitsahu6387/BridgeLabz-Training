class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature (deprecated)");
    }

    public void newFeature() {
        System.out.println("New feature (recommended)");
    }
}

public class Deprecated {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        // Deprecated method call (shows warning in IDE)
        api.oldFeature();

        // Recommended method
        api.newFeature();
    }
}
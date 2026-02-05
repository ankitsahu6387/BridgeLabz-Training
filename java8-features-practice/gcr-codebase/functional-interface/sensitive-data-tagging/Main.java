public class Main {
    public static void main(String[] args) {
        UserCredentials creds = new UserCredentials("ankit", "1234");
        PublicProfile profile = new PublicProfile();

        EncryptionService.process(creds);
        EncryptionService.process(profile);
    }
}

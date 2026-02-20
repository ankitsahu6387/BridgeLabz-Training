class EncryptionService {
    public static void process(Object obj) {
        if(obj instanceof SensitiveData) {
            System.out.println("Object contains sensitive data. Encrypting...");
        } else {
            System.out.println("Object does not contain sensitive data. No encryption needed.");
        }
    }
}

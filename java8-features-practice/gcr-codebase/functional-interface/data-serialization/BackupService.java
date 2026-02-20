class BackupService {
    public static void backup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Object is eligible for backup. Serializing...");
        } else {
            System.out.println("Object NOT eligible for backup");
        }
    }
}

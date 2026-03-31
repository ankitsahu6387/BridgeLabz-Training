public class Main {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();
        try {
            scheduler.scheduleBackup("/system/config", 5);  // critical
            scheduler.scheduleBackup("/user/photos", 2);
            scheduler.scheduleBackup("/logs", 1);
            scheduler.scheduleBackup("", 3); // exception
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }
        scheduler.executeBackups();
    }
}

public class Main {
    public static void main(String[] args) {
        UserData user = new UserData("Ankit", "ankit@gmail.com");
        LogFile log = new LogFile();
        BackupService.backup(user);
        BackupService.backup(log); 
    }
}

import java.util.*;

class BackupScheduler {

    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    void scheduleBackup(String path, int priority)
            throws InvalidBackupPathException {

        if (path == null || path.trim().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }

        queue.add(new BackupTask(path, priority));
        System.out.println("Scheduled backup for " + path);
    }

    void executeBackups() {
        System.out.println("\nExecuting backups...");

        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            task.execute();
        }
    }
}

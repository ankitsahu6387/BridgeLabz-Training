class BackupTask implements Comparable<BackupTask> {

    String folderPath;
    int priority;   // Higher value = higher priority

    BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return other.priority - this.priority; // Descending order
    }

    void execute() {
        System.out.println("Backing up folder: " + folderPath +
                " | Priority: " + priority);
    }
}

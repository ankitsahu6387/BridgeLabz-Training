class UserData implements BackupSerializable {
    private String username;
    private String email;
    public UserData(String username, String email){
        this.username = username;
        this.email = email;
    }
}

class LogFile implements BackupSerializable{
    private String filename;
}

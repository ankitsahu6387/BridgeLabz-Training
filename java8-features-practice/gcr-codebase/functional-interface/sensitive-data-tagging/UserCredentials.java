class UserCredentials implements SensitiveData {
    private String username;
    private String password;
    
    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
class PublicProfile{
    String name;
}
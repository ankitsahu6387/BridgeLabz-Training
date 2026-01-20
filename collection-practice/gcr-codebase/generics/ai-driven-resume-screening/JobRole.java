public abstract class JobRole {

    protected String roleName;

    public String getRoleName() {
        return roleName;
    }

    public abstract String getRequiredSkills();
}

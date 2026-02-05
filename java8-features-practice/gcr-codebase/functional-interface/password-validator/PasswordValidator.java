public class PasswordValidator {

    public static void main(String[] args) {

        String password1 = "Admin@123";
        String password2 = "admin123";

        System.out.println(password1 + " strong? " +
                SecurityUtils.isStrongPassword(password1));

        System.out.println(password2 + " strong? " +
                SecurityUtils.isStrongPassword(password2));
    }
}
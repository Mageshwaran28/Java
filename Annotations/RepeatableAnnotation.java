package Annotations;

@Role("Admin")
@Role("User")
@Role("Student")
class UserAccount {
    // Class implementation
}

public class RepeatableAnnotation {

    public static void main(String[] args) {
        Class<UserAccount> clazz = UserAccount.class;
        Roles rolesAnnotation = clazz.getAnnotation(Roles.class);
        if (rolesAnnotation != null) {
            Role[] roles = rolesAnnotation.value();
            for (Role role : roles) {
                System.out.println("Role: " + role.value());
            }
        }
    }
}

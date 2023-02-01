package Class12;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {

    /*
        hereStore username, password and confirm password from a user and check following requirements:
        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
        Only after all requirements met → message “Your username and password has been created”

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("plaase Enter your usersName");
        String userName = scanner.next();
        System.out.println("please Enter your password");
        String password = scanner.next();
        System.out.println("please Enter your password again");
        String confirmPassword = scanner.next();
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("username or password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println(" password is too short");

        } else if (password.contains(userName)) {

            System.out.println("password cannot contain username");

        } else if (!password.equals(confirmPassword)) {
            System.out.println("passwords do not match");

        }else {
            System.out.println(" your username and password has been created");
        }
    }
}
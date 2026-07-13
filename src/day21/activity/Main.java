package day21.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<UserAccount> accounts = new ArrayList<>();
    //static UserAccount user = new UserAccount("Romel", "Bernabe", "Cabiling", "Valenzuela", "romel@email.com", "passkoto");
    static UserAccount user = null;
    static boolean isAuthenticated = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runApp = true;

        while (runApp) {
            while (!isAuthenticated) {
                System.out.println("1 . Login");
                System.out.println("2 . Register");
                System.out.println("3 . Forgot password");
                System.out.println("0 . Exit");
                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        sc.nextLine();
                        isAuthenticated = login(sc);
                        break;
                    case 2:
                        sc.nextLine();
                        register(sc);
                        break;
                    case 0:
                        runApp = false;
                        break;
                    default:
                        System.out.println("Invalid Choice! please try again!");
                        break;
                }
            }

            if (!runApp) {
                break;
            }

            loggedInPanel(sc);
        }

        sc.close();
    }

    public static void register(Scanner sc) {
        try {
            System.out.print("First Name : ");
            String firstName = sc.nextLine();
            System.out.print("Middle Name : ");
            String middleName = sc.nextLine();
            System.out.print("Last Name : ");
            String lastName = sc.nextLine();
            System.out.print("Address : ");
            String address = sc.nextLine();

            String email;
            do {
                System.out.print("Email : ");
                email = sc.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("Invalid email format. Please enter a valid email address.");
                }
            } while (!isValidEmail(email));

            String password;
            do {
                System.out.print("Password : ");
                password = sc.nextLine();
                if (!isValidPassword(password)) {
                    System.out.println("Password must be at least 8 characters");
                }
            } while (!isValidPassword(password));

            UserAccount userAccount = new UserAccount(firstName, middleName, lastName, address, email, password);
            accounts.add(userAccount);

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    public static boolean login(Scanner sc) {

        while (true) {
            System.out.println("Login");
            System.out.print("Enter Email : ");
            String email = sc.nextLine();
            System.out.print("Enter Password : ");
            String password = sc.nextLine();

            for (UserAccount account : accounts) {
                if (email.equals(account.getEmail()) && password.equals(account.getPassword())) {
                    System.out.println("Login Success!");
                    user = account;
                    return true;
                }
            }
            System.out.println("Login Failed");
        }

    }

    public static void loggedInPanel(Scanner sc) {

        while (isAuthenticated) {
            System.out.println("Welcome : " + user.getFirstName());
            System.out.println("1 . View Account Details");
            System.out.println("2 . Change password");
            System.out.println("3 . Edit Profile");
            System.out.println("4 . Log out");
            System.out.println("0 . Exit");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    getAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter email : ");
                    String email = sc.nextLine();
                    changePassword(email);
                    break;
                case 3:
                    
                    break;
                case 4:
                    logout();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void logout() {
        if (user != null) {
            System.out.println("You have been logged out.");
            user = null;
        }
        isAuthenticated = false;
    }

    public static void getAccountInfo() {
        System.out.println("First Name : " + user.getFirstName());
        System.out.println("Middle Name : " + user.getMiddleName());
        System.out.println("Last Name : " + user.getLastName());
        System.out.println("Address : " + user.getAddress());
        System.out.println("Email : " + user.getEmail());

    }

    public static void changePassword(String email) {
        Scanner input = new Scanner(System.in);
        if (email.equals(user.getEmail())) {
            String password;
            do {
                System.out.print("Enter new password : ");
                password = input.nextLine();
                if (!isValidPassword(password)) {
                    System.out.println("Password must be at least 8 characters long and include letters and numbers.");
                }
            } while (!isValidPassword(password));

            user.setPassword(password);
            System.out.println("Change password Successfully!");
        }
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

}

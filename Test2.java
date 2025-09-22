import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";
        int attempts = 0;
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String enteredUsername = input.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = input.nextLine();

            if (!enteredPassword.equals(correctPassword) || !enteredUsername.equals(correctUsername)) {
                System.out.println("Error, incorrect username or password.\n");
                attempts++;
                if (attempts == 3) {
                    System.out.println("Number of attempts reached. Try again later.\n");
                    break;
                }
            } else {
                System.out.println("Welcome! Logging in...\n");
                loggedIn = true;
            }

            while (loggedIn) {
                System.out.println("\t Menu");
                System.out.println("1) View Profile");
                System.out.println("2) Change Username");
                System.out.println("3) Change Password");
                System.out.println("4) Log out");
                System.out.println("5) Exit");
                System.out.print("Enter choice: ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Current Username is: " + correctUsername + "\n" + "Current password is: "
                                + "*".repeat(correctPassword.length()) + "\n");
                        break;

                    case 2:
                        System.out.println("Change username?");
                        String changeUserChoice = input.nextLine();
                        if (changeUserChoice.equalsIgnoreCase("Yes")) {
                            System.out.print("Enter new username: ");
                            String changeUserInput = input.nextLine();
                            correctUsername = changeUserInput;
                            System.out.println();
                            break;
                        } else if (changeUserChoice.equalsIgnoreCase("No")) {
                            System.out.println("Bringing you back to the menu... \n");
                            break;
                        } else {
                            System.out.println("Invalid option \n");
                            break;
                        }

                    case 3:
                        System.out.println("Change Password?");
                        String changePassChoice = input.nextLine();
                        if (changePassChoice.equalsIgnoreCase("Yes")) {
                            System.out.print("Enter new password: ");
                            String changePassInput = input.nextLine();
                            correctPassword = changePassInput;
                            System.out.println();
                            System.out.println();
                            break;
                        } else if (changePassChoice.equalsIgnoreCase("No")) {
                            System.out.println("Bringing you back to the menu... \n");
                            break;
                        } else {
                            System.out.println("Invalid option\n");
                            break;
                        }

                    case 4:
                        System.out.println("Log out?");
                        String logOutInput = input.nextLine();
                        if (logOutInput.equalsIgnoreCase("Yes")) {
                            loggedIn = false;
                            System.out.println();
                            break;
                        } else if (logOutInput.equalsIgnoreCase("No")) {
                            System.out.println("Bringing you back to the menu\n");
                            break;
                        } else {
                            System.out.println("Invalid option\n");
                            break;
                        }

                    case 5:
                        System.out.println("Exiting..." + "\nLogging out..." + "\nSee you again soon!");
                        return;

                    default:
                        System.out.println("Invalid option." + "\nBringing you back to the menu. \n");
                        break;
                }
            }
        }
    }
}

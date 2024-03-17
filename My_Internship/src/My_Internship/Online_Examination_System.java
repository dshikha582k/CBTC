package My_Internship;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Online_Examination_System
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
// Dummy user
User user = new User("username", "password", "John Doe", "john@example.com");
// Dummy exam with 30 minutes time limit
Exam exam = new Exam(30);
// Login
System.out.println("Welcome to Online Examination System");
System.out.print("Enter username: ");
String inputUsername = scanner.nextLine();
System.out.print("Enter password: ");
String inputPassword = scanner.nextLine();
if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) 
{
System.out.println("Login successful. Welcome, " + user.getName() + "!");
} else 
{
System.out.println("Invalid username or password. Exiting...");
scanner.close(); // Closing scanner to avoid resource leak
return;
}
// Update Profile and Password (simplified)
System.out.print("Do you want to update your profile? (yes/no): ");
String updateProfile = scanner.nextLine();
if (updateProfile.equalsIgnoreCase("yes"))
{
System.out.print("Enter your new name: ");
String newName = scanner.nextLine();
System.out.print("Enter your new email: ");
String newEmail = scanner.nextLine();
user.setName(newName);
user.setEmail(newEmail);
System.out.println("Profile updated successfully.");
}
// Selecting answers for MCQs (not implemented in this simplified example)
// Start the exam
System.out.println("Your exam starts now. You have " + exam.timeLimit + " minutes.");
exam.startTimer();
// Simulating exam
// In a real-world scenario, you'd implement the logic for answering questions here
// Simulating end of exam
// For demonstration purpose, let's wait for a user input to simulate end of exam
System.out.println("Press 's' to submit your exam: ");
String submit = scanner.nextLine();
if (submit.equalsIgnoreCase("s")) 
{
exam.submitExam();
}
// Closing session and Logout (simplified)
System.out.println("Logout successful. Thank you for using Online Examination System.");
scanner.close(); // Closing scanner to avoid resource leak
}
}


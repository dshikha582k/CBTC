package My_Internship;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class User {
    private String username;
    private String password;
    private String name;
    private String email;

    // Constructor
    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Exam {
    int timeLimit; // in minutes
    private Timer timer;

    // Constructor
    public Exam(int timeLimit) {
        this.timeLimit = timeLimit;
        this.timer = new Timer();
    }

    // Start the timer
    public void startTimer() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Auto-submit exam when time's up
                submitExam();
            }
        }, timeLimit * 60 * 1000); // Convert minutes to milliseconds
    }

    // Submit exam
    public void submitExam() {
        System.out.println("Exam submitted successfully.");
        timer.cancel();
    }
}

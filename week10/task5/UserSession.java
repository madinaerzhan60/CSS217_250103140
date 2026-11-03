package CSS217_250103140.week10.task5;

public class UserSession {
    private final String username;
    private final String role;
    public UserSession(String username, String role) {
        this.username = username;
        this.role = role;
    }
    public String getUsername() { return username; }
    public String getRole() { return role; }
}

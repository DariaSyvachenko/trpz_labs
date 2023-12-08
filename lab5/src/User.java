import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private String email;
    private List<Task> assignedTasks;
    private List<Comment> comments;
    private List<Resource> resources;

    private UserRole role;

    public UserRole getRole() {
        return this.role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getUsername() {
        return this.username;
    }

    public String getUserDetails() {
        StringBuilder userDetails = new StringBuilder();
        userDetails.append("User ID: ").append(userId).append("\n");
        userDetails.append("Username: ").append(username).append("\n");
        userDetails.append("Email: ").append(email).append("\n");
        userDetails.append("Role: ").append(role).append("\n");

        // Додавання інформації про призначені завдання, коментарі та ресурси, якщо потрібно

        return userDetails.toString();
    }

    public void assignTask(Task task) {
        if (assignedTasks == null) {
            assignedTasks = new ArrayList<>();
        }
        assignedTasks.add(task);
    }



    public void allocateResource(Resource resource) {
        if (resources == null) {
            resources = new ArrayList<>();
        }
        resources.add(resource);
        resource.setUser(this); // Передача користувача ресурсу

    }
}


import java.util.Date;
import java.util.List;

public class Project {
    private int projectId;
    private int userId;
    private String projectName;
    private String projectDescription;
    private Date startDate;
    private Date endDate;
    private User projectManager;
    private List<User> users;
    private List<Task> tasks;

    public void setProjectManager(User manager) {
        // Перевірка прав доступу перед встановленням менеджера проекту
        if (checkPermissionForManagerAssignment(manager)) {
            this.projectManager = manager;
            performAdditionalActionsOnManagerAssignment(manager);
        } else {
            throw new SecurityException("Permission denied for assigning manager to the project");
        }
    }

    private boolean checkPermissionForManagerAssignment(User user) {
        // Перевірка ролі користувача перед встановленням менеджера проекту
        return user.getRole() == UserRole.MANAGER;
    }

    private void performAdditionalActionsOnManagerAssignment(User manager) {
        System.out.println("Manager assigned to the project: " + manager.getUsername());
    }
    private void updateChangeLog(User manager) {
        System.out.println("Change log updated for manager assignment to project: " + manager.getUsername());
    }

    private void sendNotification(User manager) {
        System.out.println("Notification sent to " + manager.getUsername() + " about the manager assignment to the project");
    }
}


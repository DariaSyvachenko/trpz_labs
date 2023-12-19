import java.util.List;
import java.util.ArrayList;
public class ProjectManagementFacade {
    private List<Project> projects;
    private List<User> users;
    private List<Resource> resources;

    public ProjectManagementFacade() {
        projects = new ArrayList<>();
        users = new ArrayList<>();
        resources = new ArrayList<>();
    }
    // Методи для додавання об'єктів до системи
    public void addProject(Project project) {
        projects.add(project);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Методи для керування взаємодією з проектами

    public void assignManagerToProject(Project project, User manager) {
        project.setProjectManager(manager);
    }

    public void addTaskToProject(Project project, Task task) {
        project.getTasks().add(task);
    }

    // Методи для керування взаємодією з завданнями

    public void assignTaskToUser(Task task, User user) {
        user.assignTask(task);
        task.setAssignee(user);
    }

    public void updateTaskStatus(Task task, TaskStatus newStatus) {
        task.updateTaskStatus(newStatus);
    }

    // Методи для керування взаємодією з користувачами

    public void allocateResourceToUser(Resource resource, User user) {
        user.allocateResource(resource);
    }

}

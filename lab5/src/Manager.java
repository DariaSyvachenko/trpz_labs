import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int managerId;
    private String username;
    private String email;
    private List<Task> managedTasks; // Список керованих завдань менеджера
    private List<User> teamMembers; // Список користувачів в команді менеджера

    public Manager() {
        this.managedTasks = new ArrayList<>();
        this.teamMembers = new ArrayList<>();
    }


    public void addTask(Task task) {
        managedTasks.add(task);

    }

    public void removeTask(int taskId) {
        managedTasks.remove(taskId);

    }

    public void addTeam(List<User> users) {
        teamMembers.addAll(users);

    }

    public void removeTeam(List<User> users) {
        teamMembers.removeAll(users);

    }



    // Геттери і сеттери для managedTasks
    public List<Task> getManagedTasks() {
        return managedTasks;
    }

    public void setManagedTasks(List<Task> managedTasks) {
        this.managedTasks = managedTasks;
    }

    // Геттери і сеттери для teamMembers
    public List<User> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<User> teamMembers) {
        this.teamMembers = teamMembers;
    }
}

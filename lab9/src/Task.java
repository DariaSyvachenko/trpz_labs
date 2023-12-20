import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int taskId;
    private int userId;
    private int projectId;
    private String taskName;
    private String taskDescription;
    private TaskStatus status;
    private Date startDate;
    private Date endDate;
    private List<Comment> comments;
    private User assignee;
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDetails() {
        StringBuilder taskDetails = new StringBuilder();
        taskDetails.append("Task ID: ").append(taskId).append("\n");
        taskDetails.append("User ID: ").append(userId).append("\n");
        taskDetails.append("Project ID: ").append(projectId).append("\n");
        taskDetails.append("Task Name: ").append(taskName).append("\n");
        taskDetails.append("Task Description: ").append(taskDescription).append("\n");
        taskDetails.append("Status: ").append(status).append("\n");
        taskDetails.append("Start Date: ").append(startDate).append("\n");
        taskDetails.append("End Date: ").append(endDate).append("\n");

        // Додавання інформації про коментарі, якщо вони існують
        if (comments != null && !comments.isEmpty()) {
            taskDetails.append("Comments:\n");
            for (Comment comment : comments) {
                taskDetails.append(comment.getCommentDetails()).append("\n");
            }
        }

        // Додавання інформації про призначеного користувача, якщо він визначений
        if (assignee != null) {
            taskDetails.append("Assignee: ").append(assignee.getUsername()).append("\n");
        } else {
            taskDetails.append("No Assignee\n");
        }

        return taskDetails.toString();
    }

    public void assignTask(User assignee) {
        this.assignee = assignee;

    }

    public void updateTaskStatus(TaskStatus newStatus) {
        this.status = newStatus;

    }

    public void addComment(Comment comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(comment);

    }
    public String getTaskName() {
        return this.taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskDescription() {
        return this.taskName;
    }
    public void setTaskDescription(String taskName) {
        this.taskName = taskName;
    }
}


import java.util.Date;

public class Comment implements Component {
    private int commentId;
    private int userId;
    private int taskId;
    private String commentText;
    private User createdBy;
    private Date createdDate;

    // Конструктор та інші поля класу

    public String getCommentDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Comment ID: ").append(commentId).append("\n");
        details.append("User ID: ").append(userId).append("\n");
        details.append("Task ID: ").append(taskId).append("\n");
        details.append("Comment Text: ").append(commentText).append("\n");
        details.append("Created By: ").append(createdBy != null ? createdBy.getUsername() : "Unknown").append("\n");
        details.append("Created Date: ").append(createdDate).append("\n");

        return details.toString();
    }
    @Override
    public String showDetails() {
        return getCommentDetails();
    }
}

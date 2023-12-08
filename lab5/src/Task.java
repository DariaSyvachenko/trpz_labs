import java.util.Date;

public class Task {
    private int taskId;
    private int userId;
    private int projectId;
    private String taskName;
    private String taskDescription;
    private TaskStatus status;
    private Date startDate;
    private Date endDate;

    // Конструктор за замовчуванням приватний, доступний тільки через Builder
    private Task() {}

    // Метод для отримання деталей завдання
    public String getTaskDetails() {
        // Логіка отримання деталей завдання
        return "Task Details: " + taskId + ", " + taskName + ", " + taskDescription + ", Status: " + status;
    }

    // Внутрішній клас-будівельник
    public static class TaskBuilder {
        private Task task;

        public TaskBuilder() {
            this.task = new Task();
        }

        public TaskBuilder taskId(int taskId) {
            task.taskId = taskId;
            return this;
        }

        public TaskBuilder userId(int userId) {
            task.userId = userId;
            return this;
        }

        public TaskBuilder projectId(int projectId) {
            task.projectId = projectId;
            return this;
        }

        public TaskBuilder taskName(String taskName) {
            task.taskName = taskName;
            return this;
        }

        public TaskBuilder taskDescription(String taskDescription) {
            task.taskDescription = taskDescription;
            return this;
        }

        public TaskBuilder status(TaskStatus status) {
            task.status = status;
            return this;
        }

        public TaskBuilder startDate(Date startDate) {
            task.startDate = startDate;
            return this;
        }

        public TaskBuilder endDate(Date endDate) {
            task.endDate = endDate;
            return this;
        }

        // Метод для побудови об'єкту
        public Task build() {
            return task;
        }
    }
    // Використання будівельника для створення об'єкту Task
    Task task = new Task.TaskBuilder()
            .taskId(1)
            .userId(101)
            .projectId(201)
            .taskName("Implement Builder Pattern")
            .taskDescription("Create a Task Builder")
            .status(TaskStatus.IN_PROGRESS)
            .startDate(new Date())
            .endDate(null)
            .build();


}



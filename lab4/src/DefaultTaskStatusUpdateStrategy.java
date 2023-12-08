public class DefaultTaskStatusUpdateStrategy implements TaskStatusUpdateStrategy {
    @Override
    public void updateStatus(Task task) {
        // Реалізація стандартного оновлення статусу завдання
        task.updateTaskStatus(TaskStatus.IN_PROGRESS);
    }
}

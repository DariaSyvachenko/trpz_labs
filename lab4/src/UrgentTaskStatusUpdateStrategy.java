public class UrgentTaskStatusUpdateStrategy implements TaskStatusUpdateStrategy {
    @Override
    public void updateStatus(Task task) {
        // Реалізація стратегії оновлення статусу для термінових завдань
        task.updateTaskStatus(TaskStatus.URGENT);
    }
}

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        ProjectObserver projectObserver = new ProjectObserverImpl();

        project.addObserver(projectObserver); // Додаємо спостерігача до проекту

        // Якщо опис проекту змінюється, спостерігач отримає оновлення
        project.updateProjectDescription("New project description");
    }
}

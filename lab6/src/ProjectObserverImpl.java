class ProjectObserverImpl implements ProjectObserver {
    @Override
    public void update(Project project) {
        System.out.println("Project with ID " + project.getProjectId() + " has been updated.");
        // Додаткова логіка для спостерігача при оновленні проекту
    }
}

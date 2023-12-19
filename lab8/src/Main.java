public class Main {
    public static void main(String[] args) {
        // Створення групи для користувачів
        Group usersGroup = new Group("Users Group");
        User user1 = new User(/* Параметри користувача */);
        User user2 = new User(/* Параметри користувача */);
        // Додавання користувачів у групу
        usersGroup.addComponent(user1);
        usersGroup.addComponent(user2);

        // Створення групи для завдань
        Group tasksGroup = new Group("Tasks Group");
        Task task1 = new Task(/* Параметри завдання */);
        Task task2 = new Task(/* Параметри завдання */);
        // Додавання завдань у групу
        tasksGroup.addComponent(task1);
        tasksGroup.addComponent(task2);

        // Створення групи для ресурсів
        Group resourcesGroup = new Group("Resources Group");
        Resource resource1 = new Resource(/* Параметри ресурсу */);
        Resource resource2 = new Resource(/* Параметри ресурсу */);
        // Додавання ресурсів у групу
        resourcesGroup.addComponent(resource1);
        resourcesGroup.addComponent(resource2);

        // Створення групи для коментарів
        Group commentsGroup = new Group("Comments Group");
        Comment comment1 = new Comment(/* Параметри коментаря */);
        Comment comment2 = new Comment(/* Параметри коментаря */);
        // Додавання коментарів у групу
        commentsGroup.addComponent(comment1);
        commentsGroup.addComponent(comment2);

        // Додавання груп до іншої групи для узагальнення
        Group mainGroup = new Group("Main Group");
        mainGroup.addComponent(usersGroup);
        mainGroup.addComponent(tasksGroup);
        mainGroup.addComponent(resourcesGroup);
        mainGroup.addComponent(commentsGroup);

        // Виведення деталей головної групи
        System.out.println(mainGroup.showDetails());
    }
}

public class Resource {
    private int resourceId;
    private int userId;
    private String resourceName;
    private String resourceType;
    private boolean availability;
    private User user; // Доданий об'єкт User для зберігання посилання на користувача



    public void setUser(User user) {
        this.user = user;

    }


    public String getResourceDetails() {

        return "Resource details";
    }
}


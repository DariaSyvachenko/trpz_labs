import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private String groupName;
    private List<Component> components;

    public Group(String groupName) {
        this.groupName = groupName;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public String showDetails() {
        StringBuilder details = new StringBuilder("Group: " + groupName + "\n");

        for (Component component : components) {
            details.append(component.showDetails()).append("\n");
        }

        return details.toString();
    }
}


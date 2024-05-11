package Entity;



import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String id;
    private String owner;
//    private List<Task> tasks;

    public Project(String name, String id, String owner) {
        this.name = name;
        this.id = id;
        this.owner = owner;
        //this.tasks = new ArrayList<>();
    }

    public Project() {
        this.name=name;
    }


    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}

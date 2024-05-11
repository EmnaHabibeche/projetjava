package Entity;

public class Task {
    private String taskId;
    private String description;
    private String status;
    private User assignedUser; // Assuming User class is defined separately

    // Constructors, getters, and setters

    public Task(String taskId, String description, String status, User assignedUser) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;
        this.assignedUser = assignedUser;
    }

    // Getters and setters

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }
}

package Package1;

public class Task {
    private String name;
    private String description;
    private boolean isComplete;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void addTask() {

    }

    public void deleteTask() {

    }
}

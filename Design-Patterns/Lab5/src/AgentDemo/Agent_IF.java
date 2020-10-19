package AgentDemo;

public interface Agent_IF {
    void startTask();
    void stopTask();
    public class TaskID {
        private int id;

    public TaskID(int id) {
        this.id = id;
    }
    public void setTaskID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
        }
    }
}

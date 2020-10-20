package AgentDemo;

public interface Agent_IF {
    void startTask();
    void stopTask();
    class TaskID {
        private int id;

    public void setTaskID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
        }
    }
}

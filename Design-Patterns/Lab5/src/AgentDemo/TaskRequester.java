package AgentDemo;
import PoolPattern.AgentDemo.ObjectPool;
import static java.lang.Thread.sleep;
public class TaskRequester {
    private int id;
    public TaskRequester(int id) {
        this.id = id;
    }
    public void setTaskID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }
    public void run() throws InterruptedException {
        ObjectPool server = null;
        Agent_IF agent=(Agent_IF)server.waitForObject();
        agent.startTask();
        sleep(100);
        agent.stopTask();
        server.release(agent);
    }
}

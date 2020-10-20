package AgentDemo;
import static java.lang.Thread.sleep;
public class FBI_Agent implements Agent_IF,Runnable {
    private boolean working;
    int i;
    String Footprint;
    private TaskRequester t;

    public FBI_Agent(String footprint) {
        this.Footprint = footprint;
    }
    public void setTask(TaskRequester t) {
        this.t = t;
    }
    public TaskRequester getTask() {
        return t;
    }
    public void run() {
        try {
            sleep(100);
            System.out.println("Agent " + Footprint + " is performing task " + getTask().getID());
        } catch (InterruptedException ex) {
        }
    }
    public void done(){
        try {
            sleep(100);
            System.out.println("Agent " + Footprint + " has completed task " + getTask().getID());
        }
        catch (InterruptedException ex) {

        }
    }


    @Override
    public synchronized void startTask() {
        this.working = true;
    }

    @Override
    public synchronized void stopTask() {
        this.working = false;
    }
}


package AgentDemo;
import static java.lang.Thread.sleep;
public class FBI_Agent implements Runnable {
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

    public synchronized void start() {
        this.working = true;
    }

    public synchronized void stop() {
        this.working = false;
    }



}


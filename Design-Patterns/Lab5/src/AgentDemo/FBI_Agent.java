package AgentDemo;
import static java.lang.Thread.sleep;
public abstract class FBI_Agent implements Agent_IF,Runnable {
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
            System.out.println("Agent " + Footprint + " is working on task " + getTask().getID());
        } catch (InterruptedException ex) {
        }
    }
    public void done(){
        try {
            sleep(100);
            System.out.println("Agent " + Footprint + " is done working on task " + getTask().getID());
        } catch (InterruptedException ex) {
        }
    }
    public synchronized void start() {
        this.working = true;
    }
    public synchronized void stop() {
        this.working = false;
    }

//    @Override
//    public void startTask() {
//
//    }
//
//    @Override
//    public void stopTask() {
//
//    }
}


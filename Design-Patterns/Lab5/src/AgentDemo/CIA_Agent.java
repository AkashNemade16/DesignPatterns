package AgentDemo;

public interface CIA_Agent {
    import static java.lang.Thread.sleep;
    public class CIA_Agent extends Object {
        private boolean working;
        int i;
        String footprint;
        private TaskRequester t;
        public CIA_Agent(String footprint) {
            this.footprint = footprint;
        }
        public void setTask(TaskRequester t) {
            this.t = t;
        }
        public TaskRequester getTask() {
            return t;
        }
        public void run() throws InterruptedException {
            try {
                sleep(100);
                System.out.println("Agent " + footprint + " is working on task " + getTask().getID());
            } catch (InterruptedException ex) {
            }
        }

        public void done()
        {
            try {
                sleep(100);
                System.out.println("Agent " + footprint + " is done working on task " +
                        getTask().getID());
            } catch (InterruptedException ex) {
            }
        }
        public synchronized void start() {
            this.working = true;
        }
        public synchronized void stop() {
            this.working = false;
        }
    }

}

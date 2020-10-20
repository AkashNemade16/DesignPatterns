package AgentDemo;
import static java.lang.Thread.sleep;
    public class CIA_Agent implements Agent_IF,Runnable{
        private boolean working;
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
        public void run(){
            try {
                sleep(100);
                System.out.println("CIA Agent " + footprint + " is performing task " + getTask().getID());
            } catch (InterruptedException ex) {
            }
        }

        public void done()
        {
            try {
                sleep(100);
                System.out.println("CIA Agent " + footprint + " is completed task " +
                        getTask().getID());
            } catch (InterruptedException ex) {
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



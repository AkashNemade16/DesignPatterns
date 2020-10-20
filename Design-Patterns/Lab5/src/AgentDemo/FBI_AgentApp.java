package AgentDemo;
import PoolPattern.AgentDemo.ObjectPool;
import java.util.ArrayList;
public class FBI_AgentApp {
    public static void main(String arg[]) throws InterruptedException {
        FBI_Agent_Creator creator = new FBI_Agent_Creator();
        ObjectPool CIA = ObjectPool.getPoolInstance(creator, 6);
        ArrayList<TaskRequester> list = new ArrayList();
        for (int i = 1; i < 13; i++) {
            TaskRequester t = new TaskRequester(i);
            list.add(t);
        }
        System.out.println("FBI Agent pool");
        int index = 0;
        TaskRequester t = list.get(index);
        while (t != null && index < list.size()) {
            try {
                FBI_Agent agent = (FBI_Agent) CIA.waitForObject();
                t = list.get(index);
                index++;
                if (t != null) {
                    agent.setTask(t);
                    agent.run();
                    agent.done();
                    Thread t1 = new Thread(() -> {
                        try {
                            Thread.sleep(1000);
                            CIA.release(agent);
                        } catch (InterruptedException ex) {
                        }
                    });
                    t1.start();
                }
            } catch (InterruptedException ex) {}
        }
    }
}


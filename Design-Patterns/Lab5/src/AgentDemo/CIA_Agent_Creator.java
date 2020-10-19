package AgentDemo;
import AgentDemo.PoolPattern.ObjectCreation_IF;
public interface CIA_Agent_Creator {

    public class CIA_Agent_Creator implements ObjectCreation_IF{
        private String[] footprints = {"@", "#", "$", "*", ".","?"};
        private int index;
        public Object create(){
            CIA_Agent agent = new CIA_Agent(footprints[index++]);
            return agent;
        }
    }
}

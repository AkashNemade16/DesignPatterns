package PoolPattern.AgentDemo;

public class ObjectPool implements ObjectPool_IF {

    private Object lockObject;
    private int size;
    private int maxInstances;
    private Object[] pool;

    private ObjectPool(ObjectCreation_IF c, int max){

    }
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public void setCapacity(int c) {

    }

    @Override
    public Object getObject() {
        return null;
    }

    @Override
    public Object waitForObject() {
        return null;
    }

    @Override
    public void release(Object o) {

    }
}

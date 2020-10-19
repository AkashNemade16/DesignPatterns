package PoolPattern.AgentDemo;

public class ObjectPool implements ObjectPool_IF {

    private static ObjectPool poolInstance;
    private final Object lockObject;
    private int size;
    private int maxInstances;
    private int instanceCount;
    private ObjectCreation_IF c;
    private Object[] pool;
    public Object server;

    private ObjectPool(ObjectCreation_IF c, int max) {
        this.c = c;
        this.size = 0;
        this.instanceCount = 0;
        this.maxInstances = max;
        this.lockObject = new Object();
        pool = new Object[maxInstances];
    }

    public synchronized static ObjectPool getPoolInstance(ObjectCreation_IF c, int max) {
        if (poolInstance == null)
            poolInstance = new ObjectPool(c, max);
        return poolInstance;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return pool.length;
    }

    public int getInstanceCount() {
        return this.instanceCount;
    }

    public int getMaxInstances() {
        return maxInstances;
    }

    public void setCapacity(int c) {
        if (c <= 0) {
            String msg = "Capacity must be greater than zero";
            throw new IllegalArgumentException(msg);
        }
        synchronized (lockObject) {
            Object[] newPool = new Object[c];
            System.arraycopy(pool, 0, newPool, 0, c);
            pool = newPool;
        }
    }
}

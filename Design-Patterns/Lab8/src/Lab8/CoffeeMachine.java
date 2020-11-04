package Lab8;

public interface CoffeeMachine {
    public void setCoffeeType(String coffeeName);

    public void setGrindingTime(int secs);

    public void setTemperature(int temp);

    public void holdTemperature(int secs);

    public void wait(int secs);

    public void setPowerLed(int num);

    public void setTypeLed(int num);

    public void computePrice(Coffee coffee);

    public void done();

    public void printTotalSales();

}

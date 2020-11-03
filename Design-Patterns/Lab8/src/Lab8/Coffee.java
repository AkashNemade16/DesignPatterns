package Lab8;

import Condiment.Condiment;

public class Coffee {

    private String name;

// private int price;

    private float condimentPrice,totalPrice,price;

    private CoffeeMakingMachineEnv env;

    private Condiment condiment;

    public Coffee(String name,float price)

    {

        this.name=name;

        this.price=price;

    }

    public String getName() {

        return name;

    }

    public float getPrice() {

        return price;

    }

    public Condiment getCondiment() {

        return condiment;

    }

    public float getCondimentPrice() {

        return condimentPrice;

    }

    public void setCondimentPrice(float condimentPrice) {

        this.condimentPrice+=condimentPrice;

    }

    public void setCondiment(Condiment condiment) {

        this.condiment = condiment;

    }

    public float getTotalPrice() {

        return totalPrice;

    }

    public void setTotalPrice(float totalPrice) {

        this.totalPrice = totalPrice;

    }

    public void setEnvironment(CoffeeMakingMachineEnv env) {

        this.env=env;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public CoffeeMakingMachineEnv getEnv() {

        return env;

    }

    public void start()

    {

    }

}
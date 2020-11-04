package Lab8;

import Condiment.Condiment;

public class Coffee {

private String name;

private float condimentPrice, totalCost, Cost;

private CoffeeMachine env;

private Condiment condiment;

public Coffee(String name,float Cost)

{

this.name=name;

this.Cost = Cost;

}

public String getName() {

return name;

}

public float getCost() {

return Cost;

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

public float getTotalCost() {

return totalCost;

}

public void setTotalCost(float totalCost) {

this.totalCost = totalCost;

}

public void setEnvironment(CoffeeMachine env) {

this.env=env;

}

public CoffeeMachine getEnv() {

return env;

}

public void start()
{

}
}
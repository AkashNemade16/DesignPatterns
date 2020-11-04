package Lab8;
import java.util.ArrayList;

import java.util.List;

public class CoffeeMachineEnvironment implements CoffeeMachine {
    private List<Coffee> salesCoffee=new ArrayList<>();

    @Override

    public void setCoffeeType(String coffeeName) {
        System.out.println("Coffee Type : "+coffeeName);
    }

    @Override

    public void setGrindingTime(int secs) {

        System.out.println("Grinding coffee for "+ secs +" seconds");

    }

    @Override

    public void setTemperature(int temp) {
        System.out.println("Setting temperature to "+temp +" F");
    }

    @Override

    public void holdTemperature(int secs) {
        System.out.println("Holding temperature to "+secs +" seconds");
    }
    @Override

    public void wait(int secs) {
        System.out.println("Waiting for "+secs +" seconds");
    }

    @Override

    public void setPowerLed(int num) {
        System.out.println("Power Led : "+num );


    }

    @Override

    public void setTypeLed(int num) {
        System.out.println("Type Led :"+num );
    }

    @Override
    public void computePrice(Coffee coffee) {
        if(coffee.getCondimentPrice()!=0)
        {
            coffee.setTotalCost(coffee.getCost()+coffee.getCondimentPrice());
            System.out.println("Total Price :" + coffee.getTotalCost());
            salesCoffee.add(coffee);
        }
        else
            {
                coffee.setTotalCost(coffee.getCost());
                System.out.println("Total Price :" + coffee.getTotalCost());
                salesCoffee.add(coffee);
            }
    }

    @Override

    public void done() {
        System.out.println("Coffee is ready");
        setPowerLed(0);

    }

    public void printTotalSales()

    {
        int sum=0;
        for (Coffee salesCoffee1 : salesCoffee) {
            System.out.println("Coffee :"+salesCoffee1.getName()+"\n Price :" +salesCoffee1.getTotalCost());
            sum+=salesCoffee1.getTotalCost();
        }
        System.out.println("Total Sales :"+sum);
    }


}

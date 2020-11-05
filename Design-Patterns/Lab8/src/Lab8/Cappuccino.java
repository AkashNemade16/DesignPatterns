package Lab8;

import Condiment.Condiment;
import java.util.Scanner;

public class Cappuccino extends Coffee{

private String cappuccino="CAPPUCCINO"; 

public Cappuccino(String name,int price)
{
    super(name,price);
    }

public String getName()
{
    return cappuccino;
    }

public void start()
    {
        String input;
        getEnv().setCoffeeType(cappuccino);
        setCondiment(new Condiment());

do{

    System.out.println("which condiments do you want: \n0. No \n1.Sugar\n2.Cream\n3.Milk");
    Scanner myObj= new Scanner(System.in); // Create a Scanner object
    input = myObj.nextLine();

if(input!=null)
    {
        setCondimentPrice(Float.parseFloat(getCondiment().addCondiment(input)));

    }
}

while(!input.equalsIgnoreCase("0"));
getEnv().setPowerLed(1);
getEnv().setTypeLed(5);
getEnv().setGrindingTime(10);
getEnv().setTemperature(300);
getEnv().holdTemperature(3);
getEnv().wait(15);
getEnv().done();
getEnv().computePrice(this);
    }


}
package Lab8;

import Condiment.Condiment;
import java.util.Scanner;

public class Espresso extends Coffee{

private int espressoPrice=4;

private String espresso="ESPRESSO";

public Espresso(String name,int price)

{

super(name,price);

}

public String getName()

{

return espresso;

}

public void start()

{

String input;

getEnv().setCoffeeType(espresso); 

setCondiment(new Condiment());

do{

System.out.println("Do you want to add condiments \n 0. No\n 1.Sugar\n 2.Cream\n 3.Milk\n");

Scanner myObj= new Scanner(System.in); // Create a Scanner object

input = myObj.nextLine();

if(input!=null)

{

setCondimentPrice(Float.parseFloat(getCondiment().addCondiment(input)));

}

}while(!input.equalsIgnoreCase("0"));


getEnv().setPowerLed(1);

getEnv().setTypeLed(4);

getEnv().setGrindingTime(10);

getEnv().setTemperature(100);

getEnv().holdTemperature(5);

getEnv().wait(15);

getEnv().done();

getEnv().computePrice(this);

} 

public int expressoPrice()

{

return espressoPrice;

}

}
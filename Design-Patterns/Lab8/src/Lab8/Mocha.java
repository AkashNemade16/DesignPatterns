package Lab8;

import Condiment.Condiment;
import java.util.Scanner;


public class Mocha extends Coffee{

private int mochaPrice=2;

private String mocha="MOCHA";

public Mocha(String name,int price)

{

super(name,price);

}

public String getName()

{

return mocha;

}

public void start()

{

String input;

getEnv().setCoffeeType(mocha);

setCondiment(new Condiment());

do{

System.out.println("Do you want to add condiments \n 0. No\n 1.Sugar\n 2.Cream\n 3.Milk\n");

Scanner myObj= new Scanner(System.in); // Create a Scanner object CS 542 Design Pattern and Object-Oriented Analysis

input = myObj.nextLine();

if(input!=null)

{

setCondimentPrice((float)Float.parseFloat(getCondiment().addCondiment(input)));

}

}while(!input.equalsIgnoreCase("0"));


getEnv().setPowerLed(1);

getEnv().setTypeLed(1);


getEnv().setGrindingTime(5);

getEnv().setTemperature(200);

getEnv().holdTemperature(5);

getEnv().wait(15);

getEnv().done();

getEnv().computePrice(this);

}


}
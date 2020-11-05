package Lab8;

import Condiment.Condiment;
import java.util.Scanner;

public class Regular extends Coffee{

private String regular="REGULAR";

public Regular(String name,int price)

{

super(name,price);

}

public String getName()

{ 

return regular;

}

public void start()

{

String input;

getEnv().setCoffeeType(regular);

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

getEnv().setTypeLed(1);

getEnv().setGrindingTime(8);

getEnv().setTemperature(150);

getEnv().holdTemperature(2); 

getEnv().wait(15);

getEnv().done();

getEnv().computePrice(this);

}



}

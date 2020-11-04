package Lab8;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Coffee order;


CoffeeMachine env=new CoffeeMachineEnvironment();

String name; 

do{

System.out.println("Welcome to Caffe Coffee Day!!\n Which Coffee do you prefer? \n1.Regular\n2.Mocha\n3.Latte\n4.Expresso\n5.Cappuccino");

Scanner input=new Scanner(System.in);

name= input.nextLine();

if(name.equalsIgnoreCase("1"))

{

order = new Regular("Regular",1);

order.setEnvironment(env);

order.start();

}

if(name.equalsIgnoreCase("2"))

{

order = new Mocha("Mocha",2);

order.setEnvironment(env);

order.start();

}

if(name.equalsIgnoreCase("3"))

{ 

order = new Latte("Latte",3);

order.setEnvironment(env);

order.start();

}

if(name.equalsIgnoreCase("4"))

{

order = new Espresso("Espresso",4);

order.setEnvironment(env);

order.start();

}

if(name.equalsIgnoreCase("5"))

{

order = new Cappuccino("Cappucino",5);

order.setEnvironment(env);

order.start();

}

}while(!name.equals("0"));

System.out.println("**********\n Total Sales");

env.printTotalSales(); 



}

}
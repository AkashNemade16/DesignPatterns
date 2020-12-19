import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ConcreteSubject extends Actor
{

   private List<Observer> listOfObservers;
   
   public ConcreteSubject(){
       listOfObservers = new ArrayList<Observer>();
   }
   
   
   public int getScore(){
       return ((MyWorld) getWorld()).getScore();
    }
    
    public int getSpeed(){
       return ((MyWorld)getWorld()).getSpeed();
    }
    
    public void setScore(int addScore){
        ((MyWorld) getWorld()).addScore(addScore);
        notifyObservers();
    }

    
    public void attach(Observer o){
        this.listOfObservers.add(o);
    }
    

    
    public void notifyObservers(){
        for(Observer o: listOfObservers){
            o.update();
        }
    }  
}

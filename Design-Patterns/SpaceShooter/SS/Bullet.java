import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Ammunation
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private Actor collidedVehicle;
    private ConcreteSubject subject;
    
    public Bullet()
    {
        GreenfootImage image=getImage();
        image.scale(20,40);
       image1 = new GreenfootImage("button-blue.png");
       image2 = new GreenfootImage("button-blue.png");
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor blocker = getOneObjectAtOffset(0, 0, Blocker.class);
        if(this != null && blocker != null)
        {
            ArrayList<ConcreteSubject> listOfSubs = (ArrayList<ConcreteSubject>)(((MyWorld)getWorld()).getObjects(ConcreteSubject.class));
               if(listOfSubs.size()>0){
                   subject = listOfSubs.get(0);
                   subject.setScore(20);
                }
            ((MyWorld)getWorld()).removeObject(blocker);
            ((MyWorld)getWorld()).removeObject(this);
            return;
        }
   
       moveUp();
       check();// Add your action code here.
    }
    public void moveUp()
    {
   
          setLocation(getX(), getY()-8);
     
    }
    public void check()
    {
       
       if(getY() == 0)
       {
         
          if(collidedVehicle != null)
          {
             getWorld().removeObject(collidedVehicle);
          }
        
            getWorld().removeObject(this);
       }
    }
}

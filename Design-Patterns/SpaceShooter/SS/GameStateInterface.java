import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public interface GameStateInterface 
{
   public abstract void doOngoingGame();
   public abstract void doPause();
   public abstract void doGameOver(); 
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStateInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface GameStateInterface 
{
   public abstract void doOngoingGame();
   public abstract void doPause();
   public abstract void doGameOver(); 
}

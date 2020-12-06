/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends GameState 
{
    // instance variables - replace the example below with your own
    public void act()  {}
    
    public GameOver(MyWorld myWorld) {
        super(myWorld);
    }
    
    @Override
    public void doGameOver() {
        my_world.setState(this);
    }

    
}

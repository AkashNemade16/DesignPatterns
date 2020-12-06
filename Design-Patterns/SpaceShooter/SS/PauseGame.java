/**
 * Write a description of class PauseGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseGame extends GameState 
{
    
    public PauseGame(MyWorld myWorld) {
        super(myWorld);
    }

    @Override
    public void doOngoingGame() {
        my_world.setState(my_world.getOngoingState());
    }
    

    
}

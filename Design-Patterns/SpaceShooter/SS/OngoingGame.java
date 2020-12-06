/**
 * Write a description of class OngoingGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OngoingGame extends GameState 
{
     public OngoingGame(MyWorld myWorld) {

        super(myWorld);

    }
    @Override
       public void doGameOver() {
                   my_world.setState(my_world.getGameOverState());
        }
    
    @Override
    public void doPause() {
        my_world.setState(my_world.getPauseState());
    }
   

    
}

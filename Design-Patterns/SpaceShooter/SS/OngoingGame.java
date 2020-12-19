
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

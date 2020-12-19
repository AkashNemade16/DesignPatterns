
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

package lab4;

public class IntermediateWeapon implements Weapon{

    String name;
    public void AddNewWeapon(String weapon){
        this.name = weapon;
    }

    public String getWeapon() {
        return "The Weapon is " +this.name;
    }
}
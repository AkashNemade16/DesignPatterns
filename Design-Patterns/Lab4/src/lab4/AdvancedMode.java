package lab4;

public class AdvancedMode implements Modes{
    @Override
    public Character createCharacter(){
        String add = "Character of Advanced mode added";
        System.out.println(add);
        return new AdvancedCharacter();
    }

    @Override
    public Weapon createWeapons() {
        String add = "Weapon of Advanced mode added";
        System.out.println(add);
        return new AdvancedWeapon();
    }
}

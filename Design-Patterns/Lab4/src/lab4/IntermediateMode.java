package lab4;

public class IntermediateMode implements Modes{
    @Override
    public Character createCharacter(){
        String add = "Character of Intermediate mode added";
        System.out.println(add);
        return new IntermediateCharacter();
    }

    @Override
    public Weapon createWeapons() {
        String add = "Weapon of Intermediate mode added";
        System.out.println(add);
        return new IntermediateWeapon();
    }
}

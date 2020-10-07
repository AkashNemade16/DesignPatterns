package lab4;

public class BeginnerMode implements Modes{
        @Override
        public Character createCharacter(){
            String add = "Character of Beginner mode added";
            System.out.println(add);
            return new BeginnerCharacter();
        }

        @Override
        public Weapon createWeapons() {
            String add = "Weapon of Beginner mode added";
            System.out.println(add);
            return new BeginnerWeapon();
        }
    }


package lab4;

public class BeginnerMode implements Modes{
        @Override
        public Character createCharacter(){
            String add = "New Character of Beginner mode added";
            System.out.println(add);
            return new BeginnerCharacter();
        }

        @Override
        public Weapon createWeapons() {
            String add = "New Weapon of Beginner mode added";
            System.out.println(add);
            return new BeginnerWeapon();
        }
    }


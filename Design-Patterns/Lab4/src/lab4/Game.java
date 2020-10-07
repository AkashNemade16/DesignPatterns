package lab4;

public class Game {

    private Character character;
    private Weapon weapon;

    public void setCharacter( final Character character, final String charactername) {
        this.character = character;
        character.AddNewCharacter(charactername);
    }
    public void setWeapon( final Weapon weapon,final String weaponName) {
        this.weapon = weapon;
        weapon.AddNewWeapon(weaponName);
    }

    public  Character getCharacter() {
        return character ;
    }
    public Weapon getWeapon() {
        return weapon ;
    }

    public void createModes( final Modes mode, final String name, final String weapon) {
        setCharacter(mode.createCharacter(), name);
        setWeapon(mode.createWeapons(), weapon);
    }

    public static void main(String[] args){
        Game game = new Game();
        System.out.println("Beginner: ");
        game.createModes(Factory.factory(Factory.TypeOfMode.BEGINNER),
        "caustic","Toxic Trapper");
        System.out.println(game.getCharacter().getCharacter());
        System.out.println(game.getWeapon().getWeapon());

        System.out.println("Intermediate:");
        game.createModes(Factory.factory (Factory.TypeOfMode.INTERMEDIATE),
        "Mirage", "Holographic Trickster");
        System.out.println(game.getCharacter().getCharacter());
        System.out.println(game.getWeapon().getWeapon());

        System.out.println("Advanced: ");
        game.createModes(Factory.factory(Factory.TypeOfMode.ADVANCED),
        "Revenant", "Synthetic Nightmare");
        System.out.println(game.getCharacter().getCharacter());
        System.out.println(game.getWeapon().getWeapon());



    }
}

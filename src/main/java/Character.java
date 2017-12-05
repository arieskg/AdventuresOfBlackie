public class Character {
    private final String Name;
    private boolean isMain = false;

    public Character(String charName) {
        Name = charName;
    }
    Character(String charName, boolean isMain){
        Name = charName;
    }

    public String getName() {
        return Name;
    }

    public static Character Blackie = new Character("Blackie", true);
    public static Character Kenny = new Character("Kenny");
    public static Character Jing = new Character("Jing");

//    public static void main(String[] args) {
//        Character Kenny = new Character("Kenny", true);
//        Character Jing = new Character("Jing");
//        System.out.println(Kenny.getName());
//
//    }

}


public class ChoicesError {
    private final String menuName;
    public String[] choiceList = new String[]{"a", "a", "a", "a", "a", "a"};

    public ChoicesError(String menuName) {
        this.menuName = menuName;
    }

    public ChoicesError(String a, String b, String c, String d){
        a = ""
    }

    public String getMenuName() {
        return menuName;
    }

    public void addChoice(String option) {
        int counter = 0;
        for (int i = 1; i < choiceList.length; i++) {
            if (choiceList[i].equals("a")) {
                choiceList[i] = option;

            }
            counter++;
        }
    }

    public static int choiceCount(String[] choiceList) {
        int choiceCount = 0;
        for (int i = 1; i < choiceList.length; i++) {
            if (!choiceList[i].equals("a")) {
                choiceCount++;
            }
        }
        return choiceCount;
    }


    public static int meowCounter(String meow) {
        int meowCount = 0;
        if (meow.equals("Meow")) {
            meowCount++;

        }
        return meowCount;
    }

    public static ChoicesError firstScenario = new ChoicesError("One");
    public static ChoicesError secondScenario = new ChoicesError("Two");
    public static ChoicesError thirdScenario = new ChoicesError("Three");

                                        //[0]


    public static void main(String[] args) {

        firstScenario.addChoice("Jump on Jing’s face");                     //[1]
        firstScenario.addChoice("Poop on bed");                             //[2]
        firstScenario.addChoice("Scratch at closed door");                  //[3]

        secondScenario.addChoice("Meow");
        secondScenario.addChoice("Attack Kenny's Feet");
        secondScenario.addChoice("Enter Hallway");

        thirdScenario.addChoice("Meow");
        thirdScenario.addChoice("Nothing");

    }
}


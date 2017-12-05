public class Choice {
    private String menuName;
    public String[] choiceList;
    public int userInput;
    public static int meowCounter = 0;

    public Choice(String menuName) {
        this.menuName = menuName;
    }

    public Choice(String a, String b, String c, String d){
        choiceList = new String[]{a,b,c,d};
    }

    public Choice(String a, String b){
        choiceList = new String[]{a,b};
    }


    public String[] getChoiceList() {
        return choiceList;
    }

    public String getMenuName() {
        return menuName;
    }

    public static String userChoice(int userInput) {
        int gameLevel = 0;
            if (userInput == 1) {
                String message = Message.meow.getMsgText();
                meowCounter++;
                System.out.println(message);
            }
            if (userInput == 2) {
                String message = Message.jingAnnoy.getMsgText();
                System.out.println(message);
            }
            if (userInput == 3) {
                String message = Message.jingPunish.getMsgText();
                String gameOver = "Game Over!";
                System.out.println(message);
            }
            if (userInput == 4) {
                gameLevel++;
            }
        return null;
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

    public static Choice choiceOne = new Choice("Meow","Jump on Jing’s face","Poop on bed","Scratch closed door");
    public static Choice choiceTwo = new Choice("Meow"
                                            ,"Attack Kenny's feet"
                                            ,"Enter Hallway","Nothing");

    public static Choice choiceThree = new Choice("Meow","Do Nothing");
}



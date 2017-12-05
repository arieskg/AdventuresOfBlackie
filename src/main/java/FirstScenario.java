import java.util.Scanner;

public class FirstScenario {
    static String[] firstScenario = new String[] {"Meow"
                                            ,"Jump on bed"
                                            ,"Poop on bed"
                                            ,"Scratch closed door"};

    static String[] secondScenario = new String[] {"Meow"
                                            ,"Attack Kenny's feet"
                                            ,"Enter Hallway"};

    public static void main(String[] args) {
        System.out.println("Blacky just woke up on the bed and is hungry. Kenny and Jing are asleep");
        System.out.println(" /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
        System.out.println("========M E N U========");

        for (int i = 0; i < firstScenario.length; i++){              // Print first scenarios
            System.out.println((i+1)+". " + firstScenario[i]);
        }

        int meowCounter = 0;
        int levelCounter = 0;
        while (levelCounter != 1) {
            Scanner reader = new Scanner(System.in);                    // Read from System.in
            System.out.println("Choose an action: ");
            int userChoice = reader.nextInt();                          // Scans the next token of the input as an int.
            if (userChoice == 1) {
                System.out.println("Meow!");
                meowCounter++;
            }
            if (userChoice == 2) {
                System.out.println("小黑烦死了！Jing goes back to sleep");
            }
            if (userChoice == 3) {
                System.out.println("卧槽！好你竟敢在床上大便！这两个星期别想吃tuna了！");
                System.out.println("Variables over!");
                break;
            }
            if (userChoice == 4) {
                if (meowCounter > 5) {
                    levelCounter += 1;
                    System.out.println("Jing's awake, opens door,");
                    System.out.print("Next Level begins.......");

                }

            }
        }
            for (int i = 0; i < secondScenario.length; i++){              // Print second scenarios
            System.out.println((i+1)+". " + secondScenario[i]);
        }
            while (levelCounter < 2) {
                Scanner reader = new Scanner(System.in);                    // Read from System.in
                System.out.println("Choose an action: ");
                int userChoice = reader.nextInt();                          // Scans the next token of the input as an int.

                if (userChoice == 1) {
                System.out.println("Meow!");
                System.out.println("Jing's Anger Level" + meowCounter);
                meowCounter++;
            }
                if (userChoice == 2) {
                System.out.println("Kenny: it tickles hehehehe");
            }
                if (userChoice == 3) {
                System.out.println("Meow!");
                meowCounter++;
            }
            }
        }


    }


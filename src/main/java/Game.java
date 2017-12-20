import java.util.Scanner;


public class Game {


    public static void main(String[] args) {
        System.out.println(Message.intro.getMsgText());
        System.out.println(Message.blackie.getMsgText());
        System.out.println(Message.menuOne.getMsgText());
        System.out.println(Message.menuText.getMsgText());

        String[] firstScenario = Choice.choiceOne.getChoiceList();
        for (int i = 0; i < firstScenario.length; i++){
            System.out.println((i + 1) + " - " + firstScenario[i]);
        }

        Scanner reader = new Scanner(System.in);                    // Read from System.in
        System.out.println("Choose an action: ");
        int userInput = reader.nextInt();                          // Scans the next token of the input as an int.
        Choice.userChoice(userInput);


            }
        }





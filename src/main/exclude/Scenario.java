import java.util.Scanner;

public class Scenario {
    private final int n;                    // number of bodies
    private final String[] choiceMenu =
    public Scenario(){

        new String[]{};

            Scanner reader = new Scanner(System.in);                    // Read from System.in
            System.out.println("Choose an action: ");
            n = reader.nextInt();
    }
}

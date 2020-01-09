import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    private MinionManager manager;
    private Scanner in = new Scanner(System.in);
    private String title= "Main Menu";

    private String[] menuOptions=  {"List minions" , "Add a new minion",
                                    "Remove minion" , "Attribute an evil deed to a minion",
                                    "Debug dump of minion details", "Exit"};
    public void show() {

        // Show menu
        boolean isDone = false;
        while (!isDone) {
            printStarBorder("*" + title + "*");
            System.out.println("*" + title + "*");
            for (int i = 0; i < menuOptions.length; i++) {
                int optionIndex = i + 1;
                System.out.println(optionIndex + ". " + menuOptions[i]);
            }

            int choice = in.nextInt();

            switch(choice) {
                case (1):
                    listMinion();

                case(2):
                    addMinion();

                case (3):



            }
        }
    }
    private void printStarBorder(String str){
        char[] stringToChars= str.toCharArray();
        for (char letter: stringToChars){
            System.out.print("*");
        }
        System.out.println();
    }

    private void listMinion(){
        System.out.println("List of Minions:");
        printStarBorder("List of Minions:");
        manager.printMinionList();
    }

    private void addMinion(){
        System.out.println("Enter minion's name: ");
        String minionName = in.nextLine();
        System.out.println("Enter minion's height: ");
        Double minionHeight = in.nextDouble();
        manager.add(new Minion(minionName,minionHeight ));
    }

    private void removeMinion(){
        listMinion();
        System.out.println("Enter 0 to cancel");

    }

}

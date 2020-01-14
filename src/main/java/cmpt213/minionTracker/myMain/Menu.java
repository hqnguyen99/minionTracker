package cmpt213.minionTracker.myMain;

import java.util.Scanner;

public class Menu {
    MinionManager manager= new MinionManager();
    Scanner in = new Scanner(System.in);
    private String title= "Main Menu";
    private String welcomeLine= "Welcome to the Evil Minion Tracker (tm)\n" +
                                "by Your Name Here.  ";
    private String firstWelcomeLine= "Welcome to the Evil Minion Tracker (tm)";
    private String[] menuOptions=  {"List minions" , "Add a new minion",
                                    "Remove minion" , "Attribute an evil deed to a minion",
                                    "Debug dump of minion details", "Exit"};
    public void showWelcomeLine(){
        // Show welcome line
        printStarBorder(firstWelcomeLine);
        System.out.println(welcomeLine);
        printStarBorder(firstWelcomeLine);
        System.out.println();
    }
    public void showMenu() {
        // Show menu
        printStarBorder("*" + title + "*");
        System.out.println("*" + title + "*");
        printStarBorder("*" + title + "*");
        for (int i = 0; i < menuOptions.length; i++) {
            int optionIndex = i + 1;
            System.out.println(optionIndex + ". " + menuOptions[i]);
        }
    }
    public void printStarBorder(String str){
        char[] stringToChars= str.toCharArray();
        for (char letter: stringToChars){
            System.out.print("*");
        }
        System.out.println();
    }
    public void listMinion(){
        System.out.println("List of Minions:");
        printStarBorder("List of Minions:");
        manager.printMinionList();
    }

    public void addMinion(){
        System.out.println("Enter minion's name: ");
        String minionName = in.nextLine();
        System.out.println("Enter minion's height: ");
        Double minionHeight = in.nextDouble();
        in.nextLine();
        manager.add(new Minion(minionName,minionHeight ));
    }

    public void removeMinion(){
        listMinion();
        System.out.println("Enter 0 to cancel");
        int selectMinionToRemove = in.nextInt();
        in.nextLine();
        if (selectMinionToRemove != 0){
            manager.remove(selectMinionToRemove);
        }
    }
    public void attributeAnDevilDeed(){
        listMinion();
        System.out.println("Enter 0 to cancel");
        int selectMinionToAttribute = in.nextInt();
        in.nextLine();
        if (selectMinionToAttribute != 0){
            manager.attributeAnEvilDeed(selectMinionToAttribute);
        }
    }
    public void debugDumpOfMinionDetails(){
        System.out.println("All minion objects:");
        manager.printDumpObject();
    }

}

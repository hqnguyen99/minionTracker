package cmpt213.minionTracker.myMain;

import java.util.*;
public class Main {
    public static void main(String[] args){
        MinionManager manager = new MinionManager();
        final Menu menuUI = new Menu(manager);
        Scanner in = new Scanner(System.in);

        // Show greeting to program
        menuUI.showWelcomeLine();
        //Run menu options
        boolean isDone = false;
        while (!isDone) {
            menuUI.showMenu();
            System.out.print("> ");
            int choice = in.nextInt();
            switch(choice) {
                case 1 :
                    in.nextLine();
                    menuUI.listMinion();
                    break;

                case 2 :
                    in.nextLine();
                    menuUI.addMinion();
                    break;

                case 3 :
                    in.nextLine();
                    menuUI.removeMinion();
                    break;

                case 4 :
                    in.nextLine();
                    menuUI.attributeAnDevilDeed();
                    break;

                case 5 :
                    in.nextLine();
                    menuUI.debugDumpOfMinionDetails();
                    break;

                case 6 :
                    in.nextLine();
                    isDone = true;
                    break;
                case 7 :
                    System.out.println("Error: Please enter a selection between case 1 and 6");
                    System.out.print(">");

            }
        }
    }

}

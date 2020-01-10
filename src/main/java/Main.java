import java.util.*;
public class Main {
    public static void main(String[] args){
        Menu menuUI = new Menu();
        Scanner in = new Scanner(System.in);

        // Show welcome greeting to program
        menuUI.showWelcomeLine();
        //Run menu options
        boolean isDone = false;
        while (!isDone) {
            menuUI.showMenu();
            int choice = in.nextInt();
            switch(choice) {
                case (1):
                    menuUI.listMinion();
                    break;

                case(2):
                    menuUI.addMinion();
                    break;

                case (3):
                    menuUI.removeMinion();
                    break;

                case (4):
                    menuUI.attributeAnDevilDeed();
                    break;

                case(5):
                    menuUI.debugDumpOfMinionDetails();
                    break;

                case(6):
                    isDone = true;
                    break;
            }
        }
    }

}

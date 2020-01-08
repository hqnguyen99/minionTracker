import java.sql.SQLOutput;
import java.util.Scanner;

public class textMenu {
    private String title= "Main Menu";
    private String welcomeLine= "Welcome to the Evil Minion Tracker (tm)\n" +
                                "by Your Name Here.  ";
    private String firstWelcomeLine= "Welcome to the Evil Minion Tracker (tm)";
    private String[] menuOptions=  {"List minions" , "Add a new minion",
                                    "Remove minion" , "Attribute an evil deed to a minion",
                                    "Debug dump of minion details", "Exit"};
    public void show() {
        // Show welcome line
        createStarBorder(firstWelcomeLine);
        System.out.println(welcomeLine);
        createStarBorder(firstWelcomeLine);
        System.out.println();
        // Show menu
        boolean isDone = false;
        while (!isDone) {
            createStarBorder("*" + title + "*");
            System.out.println("*" + title + "*");
            for (int i = 0; i < menuOptions.length; i++) {
                int optionIndex = i + 1;
                System.out.println(optionIndex + ". " + menuOptions[i]);
            }
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch(choice) {
                case
            }
        }
    }
    private void createStarBorder(String str){
        char[] stringToChars= str.toCharArray();
        for (char letter: stringToChars){
            System.out.print("*");
        }
        System.out.println();
    }

}

import java.sql.SQLOutput;

public class textMenu {
    private String title;
    private String[] menuOptions=  {"List minions" , "Add a new minion",
                                    "Remove minion" , "Attribute an evil deed to a minion",
                                    "Debug dump of minion details", "Exit"};
    public void show() {
        for (int i = 0; i < menuOptions.length; i++) {
            int optionIndex = i+1;
            System.out.println(optionIndex + ". " + menuOptions[i]);
        }
    }

}

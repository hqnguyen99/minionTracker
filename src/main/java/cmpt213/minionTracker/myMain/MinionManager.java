package cmpt213.minionTracker.myMain;

import java.util.ArrayList;
import java.util.List;
public class MinionManager {
    private List<Minion> minions  = new ArrayList<>();

    public void printMinionList(){
        if (minions.size() == 0){
            System.out.println("No minions available!");
        }
        else {
            for (int index = 0; index < minions.size(); index++) {
                int minionPosition = index + 1;
                System.out.println(minionPosition + ". " + minions.get(index).minionInfor());
            }
        }
    }
    public void add(Minion minion) {
        minions.add(minion);
    }

    public void remove(int removedMinionIndex){
        if (minions.size() == 0){
            System.out.println("No minions available to remove!");
        }
        else {
            minions.remove(removedMinionIndex - 1);
        }
    }
    public void attributeAnEvilDeed(int selectedMinion){
        if (minions.size() == 0){
            System.out.println("No minions available to attribute!");
        }
        else {
            minions.get(selectedMinion - 1).incrementNumberOfDevilDeed();
        }
    }
    public void printDumpObject(){
        for (int index = 0; index < minions.size(); index++){
            int minionPosition = index + 1;
            System.out.println(minionPosition + ". " + minions.get(index).toString());
        }
    }
    public int size(){
        return minions.size();
    }
}

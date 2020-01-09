import java.util.ArrayList;
import java.util.List;
public class MinionManager {
    private List<Minion> minions  = new ArrayList<>();

    public void add(Minion minion) {
        minions.add(minion);
    }
    public void remove(int removedMinionIndex){
        minions.remove(removedMinionIndex-1);
    }
    public void printMinionList(){
        for (int index = 0; index < minions.size(); index++){
            int minionPosition = index + 1;
            System.out.println(minionPosition + ". " + minions.get(index).minionInfor());
        }
    }
    public void printDumpObject(){
        for (int index = 0; index < minions.size(); index++){
            int minionPosition = index + 1;
            System.out.println(minionPosition + ". " + minions.get(index).toString());
        }
    }
}

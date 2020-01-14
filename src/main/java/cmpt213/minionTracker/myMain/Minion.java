package cmpt213.minionTracker.myMain;

public class Minion {
    private String name;
    private double height;
    private int numberOfEvilDeedCompleted = 0;

    public Minion(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public void incrementNumberOfDevilDeed(){
        this.numberOfEvilDeedCompleted ++;
    }
    public String minionInfor() {
        return name + ", " +
                height + ", " +
                numberOfEvilDeedCompleted + " evil deed(s)";
    }
    @Override
    public String toString() {
        return "cmpt213.minionTracker.myMain.Minion{" +
                "name=" + name +
                ", height=" + height +
                ", numberOfEvilDeedCompleted=" + numberOfEvilDeedCompleted +
                '}';
    }
}

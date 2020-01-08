public class Minion {
    private string name;
    private double height;
    private int numberOfEvilDeedCompleted;

    public Minion(string name, double height, int numberOfEvilDeedCompleted) {
        this.name = name;
        this.height = height;
        this.numberOfEvilDeedCompleted = numberOfEvilDeedCompleted;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "name=" + name +
                ", height=" + height +
                ", numberOfEvilDeedCompleted=" + numberOfEvilDeedCompleted +
                '}';
    }
}

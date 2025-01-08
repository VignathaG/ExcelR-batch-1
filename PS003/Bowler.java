package PS003;
public class Bowler {

    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    public void setBallsBowled(int ballsBowled) {
        this.ballsBowled = ballsBowled;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
    }

    @Override
    public String toString() {
        return "Bowler{" +
               "name='" + name + '\'' +
               ", wickets=" + wickets +
               ", matches=" + matches +
               ", ballsBowled=" + ballsBowled +
               ", runsConceded=" + runsConceded +
               '}';
    }

    public static void main(String[] args) {

        Bowler defaultBowler = new Bowler();
        System.out.println(defaultBowler);

        Bowler customBowler = new Bowler("Siraj", 185, 250, 7629, 6500);
        System.out.println(customBowler);
}
}
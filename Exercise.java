import java.time.ZonedDateTime;

public class Exercise {

    private String name;
    private int indexNum;

    private String repsDuration;

    private boolean completed;

    //want this to be part of object even though it's going to be
    //key of log hashmap to track potential bugs in datetime log filing
    //through potential mismatch of map key/exercise object data field
    private ZonedDateTime dateComplete;

    //running count as immutable (hopfully) index (not exercise type index)
    private int runningCount;
    public Exercise(){
        runningCount++;
    }

    public Exercise(String name, int indexNum, String repsDuration) {
        this.name = name;
        this.indexNum = indexNum;
        this.repsDuration = repsDuration;
        runningCount++;
    }

    public String getName() {
        return name;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public String getRepsDuration() {
        return repsDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public void setRepsDuration(String repsDuration) {
        this.repsDuration = repsDuration;
    }

    public String toString() {
        return "Exercise: " + name + " Index Number: " + indexNum + " Reps/Duration: " + repsDuration;
    }
}

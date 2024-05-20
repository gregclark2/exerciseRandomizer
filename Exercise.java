public class Exercise {

    private String name;
    private int indexNum;

    private String repsDuration;

    public Exercise(){}

    public Exercise(String name, int indexNum, String repsDuration) {
        this.name = name;
        this.indexNum = indexNum;
        this.repsDuration = repsDuration;
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

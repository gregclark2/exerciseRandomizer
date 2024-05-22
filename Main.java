import java.time.ZonedDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int exerciseCount = 0; //this can just be map size...change it
        //hashmap for exercise possibilities
        HashMap<Integer, Exercise> exercises = new HashMap<Integer, Exercise>();
        //hashmap for log
        HashMap<ZonedDateTime, ArrayList<Exercise>> exLog = new HashMap<>();

        //exercise objects
        Exercise airSquats = new Exercise("Air Squats", 1, "10 reps");
        Exercise pushUps = new Exercise("Push Ups", 2, "2 reps");
        Exercise lSit = new Exercise("L Sit Practice", 3, "60 seconds");
        Exercise lLifts = new Exercise("Leg Lift Variation", 4, "20");
        Exercise iRow = new Exercise("Inverted Ring Row", 5, "15");

        //add to hashmap - skipping index 0 for convenience
        exercises.put(1, airSquats);
        exercises.put(2, pushUps);
        exercises.put(3, lSit);
        exercises.put(4, lLifts);
        exercises.put(5, iRow);

        System.out.println("Time to move? (y/n)");
        Scanner input = new Scanner(System.in);
        if (input.nextLine().equalsIgnoreCase("y")){
            Random random = new Random();
            int choice = random.nextInt(exercises.size());
            System.out.println(exercises.get(choice).toString());
        }
        /* -- working on this
        System.out.println("Completed? (y/n)");
        if (input.nextLine().equalsIgnoreCase("y")){
            //needs to check if there is an arraylist for the current zonetime key,
            //if not, create one add exercise to list, add list to map
            //if yes just add exercise to current list
            //check with if getKey(zonedtime) in exlog...
        } */
        System.out.println("ok!");
        System.exit(0);





    }
}

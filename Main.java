import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int exerciseCount = 0;
        //hashmap for exercise possibilities
        HashMap<Integer, Exercise> exercises = new HashMap<Integer, Exercise>();

        //exercise objects
        Exercise airSquats = new Exercise("Air Squats", 1, "10 reps");
        Exercise pushUps = new Exercise("Push Ups", 2, "2 reps");
        Exercise lSit = new Exercise("L Sit Practice", 3, "60 seconds");
        Exercise lLifts = new Exercise("Leg Lift Variation", 4, "20");
        Exercise iRow = new Exercise("Inverted Ring Row", 5, "15");

        //add to hashmap - skipping index 0 for convenience
        exercises.put(1, airSquats);
        exerciseCount++;
        exercises.put(2, pushUps);
        exerciseCount++;
        exercises.put(3, lSit);
        exerciseCount++;
        exercises.put(4, lLifts);
        exerciseCount++;
        exercises.put(5, iRow);
        exerciseCount++;

        System.out.println("Time to move? (y/n)");
        Scanner input = new Scanner(System.in);
        if (input.nextLine().equalsIgnoreCase("y")){
            Random random = new Random();
            int choice = random.nextInt(exerciseCount) + 1;
            System.out.println(exercises.get(choice).toString());
        }
        System.out.println("ok!");
        System.exit(0);





    }
}

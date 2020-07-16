package com.saakshu.workoutsadvisor;
import java.util.ArrayList;
import java.util.List;

public class workoutexpert {
    List<String> getworkouts(String workouttypes)
    {
        List<String> workout = new ArrayList<String>();
        if (workouttypes.equals("Chest"))
        {
            workout.add("Barbell Bench Press (flat, incline or decline)");
            workout.add("Dumbbell Bench Press (flat, incline or decline)");
            workout.add("Dips (with slight forward lean)");
            workout.add("Chest Press Machine (flat, incline or decline)");
            workout.add("Dumbbell Flyes, Pec Deck Machines, Cable Crossovers)");
        }
        if (workouttypes.equals("Biceps"))
        {
            workout.add("Barbell Curls");
            workout.add("Dumbbell Curls (seated or standing)");
            workout.add("Preacher Curls (barbell or dumbbell)");
            workout.add("Chest Press Machine (flat, incline or decline)");
            workout.add("Hammer Curls");
            workout.add("Cable Curls");
        }
        if (workouttypes.equals("Triceps"))
        {
            workout.add("Dips");
            workout.add("Close Grip Bench Press (flat or decline)");
            workout.add("Laying Triceps Extension/Skull Crushers (flat/decline, barbell/dumbbell)");
            workout.add("Overhead Triceps Extension (barbell or dumbbell)");
            workout.add("Cable Press Downs");

        }
        if (workouttypes.equals("Back"))
        {
            workout.add("Pullups & Chinups");
            workout.add("Lat Pull Downs");
            workout.add("Bent Over Barbell & Dumbbell Rows");
            workout.add("Seated Cable Rows");
            workout.add("T-Bar Rows");
        }
        if (workouttypes.equals("Shoulders"))
        {
            workout.add("Overhead Barbell Press (seated or standing)");
            workout.add("Overhead Dumbbell Press (seated or standing");
            workout.add("Arnold Press");
            workout.add("Overhead Press Machine");
            workout.add("Lateral Raises");
        }

return workout;
    }

}



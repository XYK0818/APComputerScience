package FRQ.Y2019.Q2;

import java.util.ArrayList;

public class StepTracker {
    private final int minStepsActive;
    private ArrayList<Integer> stepsPerDay;

    public StepTracker(int minStepsActive)
    {
        this.minStepsActive = minStepsActive;
        stepsPerDay = new ArrayList<Integer>();
        System.out.println("object instanced");
    }

    public void addDailySteps(int steps)
    {
        stepsPerDay.add(steps);
    }

    public int activeDays()
    {
        int activeDays = 0;

        for(Integer steps : stepsPerDay)
            if(steps >= minStepsActive)
                activeDays++;

        return activeDays;
    }

    public double averageSteps()
    {
        if(stepsPerDay.size() == 0)
            return 0;

        int totalSteps = 0;

        for(Integer steps : stepsPerDay)
            totalSteps += steps;

        return (double) totalSteps / stepsPerDay.size();
    }
}

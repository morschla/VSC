
public class CSATest{

    private int activeDayCounter, totalSteps, dayCounter, activeLimit;
    

    public CSATest(int activeLimit){
        this.activeLimit = activeLimit;

    }

    public void addDailySteps(int steps){
        
        totalSteps += steps;
        dayCounter++;
        if(steps >= activeLimit){
            activeDayCounter++;
        }
    }

    public int activeDays(){
        return activeDayCounter;
    }

    public double averageSteps(){
        if(dayCounter == 0){
            return 0;
        }
        return (double) totalSteps / dayCounter;
    }
}
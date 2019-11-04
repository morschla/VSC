

public class Student
{
    private String name;
    private int pointsEarned;
    private int pointsPossible;
    
    
    public Student(){
        name = "Jane Doe";
    }
    
    public Student(String Galen){
        name = "Galen";
    }
    
    public void addAssignment(int earned, int possible){
        pointsEarned = pointsEarned + earned;
        pointsPossible = pointsPossible + possible;
    }
    
    public String toString(){
        return name + ": Points Earned: " + pointsEarned + ", Points Possible: " + pointsPossible;
    }
    
    public double getPercent(){
        return (double) pointsEarned / pointsPossible * 100;//System.out.println((pointsEarned/pointsPossible)*100 + "%");
        
        // return pointsEarned * 100. / pointsPossible;
        // return 1. * pointsEarned / pointsPossible * 100;
        
    }
}

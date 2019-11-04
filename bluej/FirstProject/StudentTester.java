

public class StudentTester
{
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.addAssignment(75, 100);
        s1.addAssignment(69, 420);
        System.out.println(s1);
        
        Student s2 = new Student("me");
        s2.addAssignment(101, 100);
        System.out.println(s2);
    }
}

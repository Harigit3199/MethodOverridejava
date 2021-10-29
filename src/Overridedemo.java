class Students
{
    String Name ,Subject;
    int Rollno;
    int Marks;

    public void studentName()
    {
        Name="Hari";
        Rollno = 25;
        Subject= "Maths";
        Marks= 78;


        System.out.println("Name of the student: " + Name);
        System.out.println("Roll number of the student: "+Rollno);
        System.out.println("Name of the Subject: " +Subject);
        System.out.println("Subject Marks: "+ Marks);
        System.out.println( );
    }

}
class Student1 extends Students
{
    String Name ,Subject;
    int Rollno;
    int Marks;

    public void studentName()
    {
        Name="Haran";
        Rollno = 40;
        Subject= "Computer Science";
        Marks= 70;


        System.out.println("Name of the student: "+ Name);
        System.out.println("Roll number of the student: "+Rollno);
        System.out.println("Name of the Subject: " + Subject);
        System.out.println("Subject Marks: "+ Marks);
    }

}
public class Overridedemo
{
    public static void main(String[] args)
    {
        Students details= new Students();
        Student1 detail= new Student1();
        details.studentName();
        detail.studentName();
    }
}
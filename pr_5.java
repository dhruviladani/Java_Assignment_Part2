//21ce061
//Dhruvi Ladani
public class pr_5
{
    void record(String t )
    {
        System.out.println(t);
    }
    void record(String studentName,char grade)
    {
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    void record(int id,String studentName,char grade)
    {
        System.out.println("\nStudent ID is "+id);
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    public static void main(String[]args)
    {
        pr_5 O =new pr_5();
        O.record("Record of students:");

        O.record("Tanya",'A');
        O.record(8, "Pakhi", 'B');

        System.out.println("\nBy 21CE061");
    }
}
public class students
{
    private int rollnumber;
    private String studentname;
    public students()////////  Default constructor 
    {
        rollnumber = 0;
        studentname = "empty";
    }
    public students(int r, String sn) //// parameter constructor 
    {
        rollnumber = r;
        studentname = sn;
    }
    public students (students s) //// copy constructor 
    {
        rollnumber = s.rollnumber;
        studentname = s.studentname;
    }
    public void setname(String sn)
    {
        studentname = sn;
    }
    public void setrollnumber(int ro)
    {
     rollnumber = ro;   
    }
    public String getstudentname()
    {
        return studentname;
    }
     public int  getrollnumber()
    {
        return rollnumber;
    }
     public void print()
     {
         System.out.println("the name of student is "+ studentname);
         System.out.println("the rollno of student is "+ rollnumber);
     }
}

class students
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
public class test {
    public static void main(String[] args) 
    {   
        students s1 = new students();
        students s2 = new students(120,"wasim");
        students s3 = new students(s1);
        students s4 = new students(s2);
        System.out.println("viewing detail of objects s1");
        s1.print();
        System.out.println("viewing detail of objects s2");
        s2.print();
        System.out.println("viewing detail of objects s3");
        s3.print();
        System.out.println("viewing detail of objects s4");
        s4.print();
    }
    
}

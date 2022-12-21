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

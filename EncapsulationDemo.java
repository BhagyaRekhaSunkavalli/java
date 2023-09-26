class Student {
    public String sname;
    private String sphone;
    public String getSPhone(){
        return sphone;
    }
    public void setsphone(String ph) {
        this.sphone=ph;
    }
}
public class EncapsulationDemo
{
    public static void main(String args[]) {
        Student s=new Student();
        s.sname="suma";
        s.setsphone("955*******");
        System.out.println("student name is "+s.sname);
        System.out.println("Student phonenumber is "+s.getSPhone());
    }
}

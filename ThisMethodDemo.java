class A{
    void M(){
        System.out.println(" inside method M ");
    }
    void n(){
        System.out.println(" inside method N ");
        this.M();
    }
}
public class ThisMethodDemo{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }
}

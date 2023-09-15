import java.io.*;
 public class Bank{
    int getRateOfIntrest()
    {
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfIntrest()
    {
        return 8;
    }
}
class HDFC extends Bank{
    int getRateOfIntrest()
    {
        return 9;
    }
}
class UnionBank extends Bank{
    int getRateOfIntrest()
    {
        return 10;
    }
}
 class MethodOverloadingDemo{
public static void main(String args[]){
    SBI S=new SBI();
    HDFC H=new HDFC();
    UnionBank U=new UnionBank();
    System.out.println("SBI rate of intrest is "+S.getRateOfIntrest);
    System.out.println("HDFC rate of intrest is "+H.getRateOfIntrest);
    System.out.println("UnionBank rate of intrest is "+U.getRateOfIntrest);
}
}

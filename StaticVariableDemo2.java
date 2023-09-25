import java.io.*;
class CounterDemo{
    static int count = 0;
  CounterDemo()
    {
        count++;
        System.out.println("count = "+count);
    }
}
public class StaticVariableDemo2{
    public static void  main(String args[]){
        CounterDemo Cd=new CounterDemo();
        CounterDemo Cd1=new CounterDemo();
        CounterDemo Cd2=new CounterDemo();
    }
}

import java.io.*;
public class ArrayForEach
{
    public static void main(String args[])
    {
        int a[]={11,22,33,44,55};
        System.out.println("The elements of the array are ");
        for(int i:a)
        {
            System.out.println(i+ " ");
        }
    }
}

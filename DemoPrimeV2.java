import java.util.*;
public class DemoPrimeV2 {
    public static void main(String args[]){
        int i,flag=0;
        System.out.println(" Enter an integer to check prime or not ");
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        for(i=2;i<=num/2;i++){
            if(num%i == 0){
                System.out.println(num+" is not a prime number ");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println(num+" ia a prime number ");
        }
    }
}

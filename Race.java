class Race 
{ 
public static void main(String a[]) 
{ 
double[] arr=new double[5]; 
double average, sum=0; 
for(int i=0;i<5;i++) 
{ 
arr[i]=Double.valueOf(a[i]); 
} 
for(int i=0;i<5;i++) 
sum+= arr[i]; 
average=sum/5; 
System.out.print("The speed of the racers >= average speed " +average+": "); 
for(int i=0;i<5;i++) 
{ 
if(average<=arr[i]) 
System.out.print(", "+arr[i]); 
} 
} } 

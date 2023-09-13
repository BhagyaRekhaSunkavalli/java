import java.util.*; 
class BubbleSort{ 
public static void main(String args[]){ 
Scanner sc = new Scanner(System.in); 
int temp,i,j; 
System.out.print("Enter no of elements: "); int n=sc.nextInt(); 
System.out.println("Enter the elements: "); 
int a[]=new int[n]; 
for(i=0;i<n;i++) 
{ 
a[i]=sc.nextInt(); 
} 
System.out.println("Sorted elements: "); 
for(i=0;i<n-1;i++) 
{ 
for(j=0;j<(n-1-i);j++) 
{ 
if(a[j]>a[j+1]) 
{ 
temp=a[j]; 
a[j]=a[j+1]; 
a[j+1]=temp; 
} 
} 
} 
for(i=0;i<n;i++) 
{ 
System.out.print(a[i]+" "); 
} 
} 
} 

import java.util.*; 
public class BinarySearch{ 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the number of elements: "); 
int n=sc.nextInt(); 
int a[] = new int[n]; 
System.out.println("Enter the sorted elements: "); 
for(int i=0;i<n;i++) 
{ 
} 
a[i]=sc.nextInt(); 
System.out.print("Enter the element to search for: "); 
int key-sc.nextInt(); 
int low=0, high-n-1,mid; 
while(low<=high) 
{ 
mid=(low+high)/2; 
if (key==a[mid]) 
{ 
} 
System.out.println("Element "+key+" found at index "+mid); 
break; 
else if(key>a[mid]) 
{ 
low-mid+1; 
} 
else 
{ 
high-mid-1; 
} 
} 
if(low>high) 
{ 
System.out.println("Element "+key+" not found in the list."); 
}
}
}

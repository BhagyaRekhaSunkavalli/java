class QuadraticRoots 
{ 
double a,b,c; 
void getData(String c1,String c2,String c3) 
{ 
a=Double.valueOf(c1); 
} 
b=Double.valueOf(c2); 
c=Double.valueOf(c3); 
void roots() 
{ 
double d; 
if(a==0) 
{ 
double root; 
root=-c/b; 
System.out.println("linear equation "+root); 
} 
else{ 
} 
d=(b*b)-(4*a*c); 
if(d==0) {double root--b/(2*a); 
System.out.println("Roots are equal and value is : "+root); 
else if(d>0) 
{ 
} 
double r1,r2; 
r1=(-b+Math.sqrt(d))/(2*a); 
r2=(-b-Math.sqrt(d))/(2*a); 
System.out.println("First root is: "+r1+" Second root is: "+r2); 
Sasi Institute of Technology and Engineering (Autonomous) 
2022-2026-CSE-AIML 
ID: 22K61A4252 
Page No: 1 
else 
System.out.println("Roots are imaginary"); 
} 
} 
public static void main(String a[]) 
{ 
QuadraticRoots r=new QuadraticRoots(); 
r.getData(a[0], a[1],a[2]); 
r.roots(); 
} 
} 

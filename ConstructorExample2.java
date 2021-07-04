class Sample
{ 
Sample()
{
System.out.println("This is default constructor");
} 
Sample(int x)
{
System.out.println("This is parameterized constructor");
System.out.println(x);
} 
}
class ConstructorExample2
{ 
public static void main(String args[]){ 
Sample obj1=new Sample(); 
Sample obj2=new Sample(100);
} 
}
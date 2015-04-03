public class StaticDemo
{
int a=10 ;
int s=0 ;
static int b;
static int arr[]={1,2,3,4,5,6,7,8,9};
public void sum(int a[])
{
	for(int c:arr)
	{
		s+=c;
	}
	System.out.println("the sum of array elements is"+s);	
}

public static void main(String s[])
{	
	StaticDemo s1=new StaticDemo (); 
	System.out.println(s1.a);
	System.out.println(b);
	StaticDemo s2=new StaticDemo ();
	s2.sum(arr);
	
}
}
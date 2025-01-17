/*
21.
A A A A A
 B B B B
  C C C
   B B
    A
*/


class AssigQ21
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=5;i>0;i--)
	{
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	}
	ch++;
	System.out.println();
	}
	}
}
/*
14.
    A
   A B
  A B C
 A B C D
A B C D E
*/

class AssigQ14
{
	public static void main(String[] arge)
	{
	for(int i=1;i<=5;i++)
	{
	char ch ='A';
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	ch++;
	}
	System.out.println();
	}
	}
}
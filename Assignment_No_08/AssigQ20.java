/*
20.
A B C D E
 A B C D
  A B C
   A B
    A
*/

class AssigQ20
{
	public static void main(String[] arge)
	{
	for(int i=5;i>0;i--)
	{
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	char ch ='A';
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	ch++;
	}
	System.out.println();
	}
	}
}
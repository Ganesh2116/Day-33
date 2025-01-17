/*
18.
    E
   D D
  C C C
 B B B B
A A A A A
*/


class AssigQ18
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=1;i<=5;i++)
	{
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	}
	ch--;
	System.out.println();
	}
	}
}
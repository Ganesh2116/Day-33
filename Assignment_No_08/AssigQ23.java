/*
23.
    A
   B B
  C C C
 D D D D
E E E E E
*/

class AssigQ23
{
	public static void main(String[] arge)
	{
	char ch ='A';
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
	ch++;
	System.out.println();
	}
	}
}

/*
19.
E E E E E
 D D D D
  C C C
   B B
    A
*/

class AssigQ19
{
	public static void main(String[] arge)
	{
	char ch ='E';
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
	ch--;
	System.out.println();
	}
	}
}
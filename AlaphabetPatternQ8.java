/*
8.
EEEEE
DDDD
CCC
BB
A
*/

class AlaphabetPatternQ8
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=5;i>0;i--)
	{
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	}
	ch--;
	System.out.println();
	}
	}
}
/*
Q4
E
DD
CCC
BBBB
AAAAA
*/

class AlaphabetPatternQ4
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=1;i<=5;i++)
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
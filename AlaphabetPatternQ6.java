/*
6.
AAAAA
BBBB
CCC
DD
E
*/

class AlaphabetPatternQ6
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=5;i>0;i--)
	{
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	}
	ch++;
	System.out.println();
	}
	}
}
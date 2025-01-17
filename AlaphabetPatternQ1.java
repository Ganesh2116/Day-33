/*
1.
A
BB
CCC
DDDD
EEEEE
*/

class AlaphabetPatternQ1
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=1;i<=5;i++)
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
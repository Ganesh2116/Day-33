/*
2.
A
AB
ABC
ABCD
ABCDE
*/

class AlaphabetPatternQ2
{
	public static void main(String[] arge)
	{
	
	for(int i=1;i<=5;i++)
	{
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
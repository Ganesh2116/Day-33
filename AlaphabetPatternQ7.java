/*
7.
ABCDE
ABCD
ABC
AB
A
*/

class AlaphabetPatternQ7
{
	public static void main(String[] arge)
	{
	for(int i=5;i>0;i--)
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
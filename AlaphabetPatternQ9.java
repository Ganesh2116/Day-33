/*
9.
EDCBA
EDCB
EDC
ED
E
*/

class AlaphabetPatternQ9
{
	public static void main(String[] arge)
	{
	for(int i=5;i>0;i--)
	{
	char ch ='E';
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	ch--;
	}
	System.out.println();
	}
	}
}
/*
3.
E
ED
EDC
EDCB
EDCBA
*/

class AlaphabetPatternQ3
{
	public static void main(String[] arge)
	{
	
	for(int i=1;i<=5;i++)
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
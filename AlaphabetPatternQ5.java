/*
Q5
A
BA
CBA
DCBA
EDCBA
*/

class AlaphabetPatternQ5
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=1;i<=5;i++)
	{
	char ch1 = ch;
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch1+" ");
	ch1--;
	}
	ch++;
	System.out.println();
	}
	}
}
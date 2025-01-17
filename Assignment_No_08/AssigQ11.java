/*
11.

EDCBA
FEDC
GFE
HG
I
*/

class AssigQ11
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=5;i>0;i--)
	{
	char ch1 =ch;
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
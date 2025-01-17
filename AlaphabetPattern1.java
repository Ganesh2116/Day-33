/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/

class AlaphabetPattern1
{
	public static void main(String[] arge)
	{
	for(int i=1;i<=5;i++)
	{
	char ch = 'A';
	for(int j=1;j<=5;j++)
	{
	System.out.print(ch+" ");
	ch++;
	}
	System.out.println();
	}
	}
}
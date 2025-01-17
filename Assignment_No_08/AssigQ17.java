/*
17.

    E
   D E
  C D E
 B C D E
A B C D E
*/


class AssigQ17
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=1;i<=5;i++)
	{
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	char ch1 =ch;
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch1+" ");
	ch1++;
	}
	ch--;
	System.out.println();
	}
	}
}
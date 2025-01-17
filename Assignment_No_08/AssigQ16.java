/*
16.
    A
   B A
  C B A
 D C B A
E D C B A

*/

class AssigQ16
{
	public static void main(String[] arge)
	{
	char ch ='A';
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
	ch1--;
	}
	ch++;
	System.out.println();
	}
	}
}
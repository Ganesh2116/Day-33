/*
22.
E D C B A
 D C B A
  C B A
   B A
    A
*/


class AssigQ22
{
	public static void main(String[] arge)
	{
	char ch ='E';
	for(int i=5;i>0;i--)
	{
	
	for(int j=5;j>=i;j--)
	{
	System.out.print(" ");
	}
	char ch1 = ch;
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
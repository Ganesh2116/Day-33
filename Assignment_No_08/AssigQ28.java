/*
28.  
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
*/

class AssigQ28
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=1;i<=9;i++)
	{
	if(i%2 !=0){
	for(int j=9;j>=i;j--)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print(ch+" ");
	}
	ch++;
	}
	System.out.println();
	}
	}
}
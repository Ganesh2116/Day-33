/*
A B C D E
E F G H I
J K L M N
O P Q R S 
T U V W X
*/

class AlaphabetPattern2
{
	public static void main(String[] arge)
	{
	char ch ='A';
	for(int i=1;i<=5;i++)
	{
	for(int j=1;j<=5;j++)
	{
	System.out.print(ch+" ");
	ch++;
	}
	System.out.println();
	}
	}
}
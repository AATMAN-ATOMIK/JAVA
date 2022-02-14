/* 
	*	*	*	*
	*			*
	*			*
	*			*
	*	*	*	*	
*/
import java.util.*;

class hollowrect
{
	public static void main(String [] args)
	{
		int i,j,r,c;
		System.out.println("Enter r and c : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		for(i = 0 ; i <= r ; i++)
		{
			for(j = 0 ; j <= c ; j++)
			{
				if(i == 0 || i == r || j == 0 || j == c)
				{
					System.out.print(" ^_^ ");
				}
				else
				{
					System.out.print("     ");
				}
			}
			System.out.println("");
		}
	}
}
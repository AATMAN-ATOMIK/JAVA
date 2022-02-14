public class odarray
{
        public static void main(String[] args) 
        {
			//Jagged array
			int n = 0;
			int [] [] JaggedArray = new int[2][];
			JaggedArray[0] = new int[2];
			JaggedArray[1] = new int[4];
			
			//Entering static value in jagged array 
			for(int i = 0 ; i < JaggedArray.length ; i++)
			{
				for(int j = 0 ; j < JaggedArray[i].length ; j++ )
				{
					JaggedArray[i][j] = n++;
					//n++;
				}
			}
			for(int i = 0 ; i < JaggedArray.length ; i++)
			{
				for(int j = 0 ; j < JaggedArray[i].length ; j++ )
				{
					System.out.print(JaggedArray[i][j]);
				}
				System.out.println("");
			}
        }
}
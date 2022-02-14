/*
1. WAP to get 3 numbers from the user. Perform following action on them.
A-1 : Pelindrom
A-2 : Fibonacey series
A-3 : Do sum of number 1 and number 2 store it into another variable also do sum of number 2 and number 3 store it into another variable and do sum of number 1 and number 3 now check which ans is large and print it.
A-4 : Find the square root of all the numbers and do sum of them now check which number is largest and smallest from last actions largest value.
remaining - A-5 : Do all the numbers of sum and find the square root after check number is armstrong or not if it is then find power of that number otherwise print sequence of that number until +20 number.
*/
import java.util.*;
import java.lang.Math;
public class numbers
{
	public static void armstrong(double s) 
	{
		double number=s, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if((int)result == number)
        {
			System.out.println((int)number + " is an Armstrong number.");
			double p = Math.pow(s, 2);
			System.out.println("Power of number is : " + p);
			System.out.println();
		}
		else
    	{
			   System.out.println((int)number + " is not an Armstrong number.");
			   for(int j = 0;j<=20;j++)
			   {
				   System.out.println("Number : " + (int)s);
				   s++;
			   }
			   System.out.println();
		}
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println();
		
		//Pelindrom
		int n = a+b+c;
		int nn = n;  //storing sum of three numbers
		int sum = 0;
		while(n != 0)
		{
			int r = n%10;  //Get reminder
			sum = (sum*10) + r; //Storing reminder in sum with *10
			n = n / 10;	//Deleting last no.
		}
		if(sum==nn)
		{
			System.out.println("Number is pelindrom ^_^");
		}
		else
		{
			System.out.println("Number is not pelindrom Y_Y");
		}
		System.out.println();
		
		//Fibonacey
		
		int n1=0,n2=1,n3,i,count=10;    
		System.out.println(" " + n1 + " ");
		System.out.println(" " + n2); //printing 0 and 1    
    
		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.println(" "+n3);    
			n1=n2;    
			n2=n3;    
		}
		System.out.println();

		//A-3 && A-4 && A-5
		
		int sum1 = a + b; //100 + 20
		int sum2 = b + c; //20 + 1
		int sum3 = a + c; //1 + 100
		
		double sa = Math.sqrt(a);
		System.out.println("Square root of a : " + sa);
		double sb = Math.sqrt(b);
		System.out.println("Square root of b : " + sb);
		double sqc = Math.sqrt(c);
		System.out.println("Square root of c : " + sqc);
		double ssum = sa+sb+sqc; // sum of square root
		
		if(sum1>sum2 && sum1>sum3)
		{
			System.out.println("Largest sum of is  (ANS OF A-3)" + sum1);
			System.out.println();
			if(sum1>ssum)
			{
				System.out.println(sum1 + " A-3 ans is larger then A-4 ans" + ssum);
				double sqr = Math.sqrt(sum1);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans "  + sum1);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else if(sum2>sum1 && sum2>sum3)
		{
			System.out.println("Largest sum of is (ANS OF A-3)" + sum2);
			System.out.println();
			if(sum2>ssum)
			{
				System.out.println(sum2 + " A-3 ans is larger then A-4 ans " + ssum);
				double sqr = Math.sqrt(sum2);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans " + sum2);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else if(sum3>sum1 && sum3>sum2)
		{
			System.out.println("Largest sum of is (ANS OF A-3)" + sum3);
			System.out.println();
			if(sum3>ssum)
			{
				System.out.println(sum3 + " A-3 ans is larger then A-4 ans " + ssum);
				double sqr = Math.sqrt(sum3);
				armstrong(sqr);
				System.out.println();
			}
			else
			{
				System.out.println(ssum + " A-4 ans is larger then A-3 ans " + sum3);
				double sqr = Math.sqrt(ssum);
				armstrong(sqr);
				System.out.println();
			}
		}
		else
		{
			System.out.println("No largest number UwU");
			System.out.println();
		}
		sc.close();
	}
}

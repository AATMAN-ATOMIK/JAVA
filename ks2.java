import java.util.Scanner;

//WAP to get values from the user and print odd numbers and even numbers.
//Also print sum of odd number and even numbers.\
//if sum is greater than 50 than divide by entered total number else multiplied by 3;
//c# perform following action on the database.
//1.Create database named as student.
//2.Create table named as SYBCA(id,name,contact.no,eamil,address).
//3.Perform insert query on sybca table.
public class ks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" total numbers : ");
        int n = sc.nextInt();
        int te=0,to=0;
        System.out.println(" Enter numbers : ");
        int []a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {   
                System.out.println("Even : " + a[i]);
                te+=a[i];
            }
            else
            {
                System.out.println("Odd : " + a[i]);
                to+=a[i];
            }
        }
        System.out.println("Total of even numbers : " + te);
        System.out.println("Total of odd numbers : " + to);
        if(te>50)
        {
            int ans = te/a.length;
            System.out.println("sum of e num is >50 so division is : " + ans);
        }
        else
        {
            int ans = te*3;
            System.out.println("multiplication of sum of e num  by 3 is : " + ans);
        }

        if(to>50)
        {
            int ans2 = to/a.length;
            System.out.println("sum of o num is >50 so divisin is : " + ans2);
        }
        else
        {
            int ans2 = to*3;
            System.out.println("multiplication of sum of e num  by 3 is : " + ans2);
        }
    }
}

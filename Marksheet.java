import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
       
        int total=0;
        int [] m = new int [4];
        Scanner s = new Scanner(System.in);
    
        for(int i=0 ; i<=3 ; i++)
        {
            m[i]=s.nextInt();
            total+=m[i];
        }

        int per = total/4;
        System.out.println("Your marks are : ");

        for(int j=0;j<=3;j++)
        {
            System.out.println("Mark " + (j+1) + " " + m[j]);
        }
        if(per>=70)
            System.out.println("Your grad is A+");
        
        else if(per>=60)
            System.out.println("Your grad is A");

        else if(per>=50)
            System.out.println("Your grad is B");

        else if(per>=40)
            System.out.println("Your grad is C");
        
        else 
            System.out.println("You Failed in Exam");
    }
}

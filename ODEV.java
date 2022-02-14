import java.util.Scanner;

public class ODEV {
    public static void main(String[] args) {
        int n=10;
        int e=0,o=0;
        while(n<=15)
        {
            if(n%2==0)
                e++;
            else
                o++;

            n++;
        }
        System.out.println("Total even numbers are : " + e);
        System.out.println("Total odd numbers are : " + o);
    }    
}

import java.util.Scanner;

class EO
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        if(a%2==0)
                System.out.println("Inputed value is Even");
        else
            System.out.println("Inputed value is Odd");
        
    }
}

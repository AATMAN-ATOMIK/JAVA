import java.util.Scanner;

public class PNZ {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        if(a>=0){
            
            if(a==0)
                System.out.println("Inputed value is zero");
            else    
                System.out.println("Inputed value is possitive");
        
        }
        else{
            System.out.println("Inputed value is negative");
        }
    }
}
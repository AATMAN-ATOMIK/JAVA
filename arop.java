import java.util.Scanner;

//WAP to get two values from user and one operator from user. Perform action base on operator. For that create one function name with arithmatic;
public class arop
{
    public static void arithmatic(float x,float y,String s) {
        float n1=x,n2=y;
        float ans;
        String s1=s;
        switch(s1)
        {
            case "+" :
                ans=n1+n2;
                System.out.println("Sum is : " + ans);
                break;
            case "-" :
                ans=n1-n2;
                System.out.println("Sub is : " + ans);
                break;
            case "*" :
                ans=n1*n2;
                System.out.println("Mul is : " + ans);
                break;
            case "/" :
                ans=n1/n2;
                System.out.println("Div is : " + ans);
                break;
            default : 
                System.out.println("Enter valid number or operator");
        }

    }
    public static void main(String[] args) {
        Float a,b;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and after that enter operator : ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.next();
        arithmatic(a,b,c);
        sc.close();
    }
}
//WAP which displays multiplication and division of any two numbers
public class Add {
    public static void main(String[] args) {
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int M=n1*n2;
        int D=n1/n2;
        System.out.println("Multiplication : " + M);
        System.out.println("Division : " + D);
    }    
}



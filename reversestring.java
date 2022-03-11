import java.util.Scanner;

public class reversestring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System. out. println("Enter string to reverse:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System. out. println("Reversed string is:"); System.out.println(sb.reverse().toString());
        sc.close();
    } 
}

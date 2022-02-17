import java.util.Scanner;

class resme 
{
    public void resprint()
    {
        String nm;
        int m1,m2,m3,m4,total,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and 4 marks : ");
        nm = sc.nextLine();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        total = m1 + m2 + m3 + m4;
        per = total/4;
        System.out.println("Student " + nm + " got percentage " + per);
    }

}
public class reskm extends resme
{
    public void resprint()
    {
        String nm;
        int m1,m2,m3,m4,total,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and 4 marks : ");
        nm = sc.nextLine();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        total = m1 + m2 + m3 + m4;
        per = total/4;
        System.out.println("Student "  + " got percentage " + per);
    } 
    public static void main(String[] args) 
    {
        resme my = new resme();
        my.resprint();    
        resme your = new reskm();
        your.resprint();
    }   
}

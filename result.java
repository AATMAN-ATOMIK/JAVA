import java.util.*;

public class result {
    public int rlno;
    public int total=0;
    public String nm;
    public int[] m = new int[3];
    public char grade; 
    Scanner sc = new Scanner(System.in);

    public void get()
    {
        System.out.println("Enter rlno : ");
        rlno=sc.nextInt();
        System.out.println("Enter your name : ");
        nm=sc.next();
        
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println("Enter mark");
            m[i]=sc.nextInt();
            total=total + m[i];
        }
        if (total/3 >= 90) {
            grade='A';            
        } else if(total<90 && total>=70) {
            grade='B';
        }
        else if(total<70 && total >=50){
            grade='c';
        }
        else{
            grade='D';
        }
    }
    public void disp() {
        System.out.println("Rollno : " + rlno + "Name : " + nm);
        for(int j=0 ; j<3 ; j++)
        {
            System.out.println("Mark : "+ m[j]);        
        }
        System.out.println("Total : " + total + "Grade : " + grade);
    }
    public static void main(String[] args) {
        result r = new result();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total no of Student : ");
        int no = s.nextInt();
        for(int k=0;k<=no;k++)
        {
            r.get();
            r.disp();
        }
        s.close();
    }
}

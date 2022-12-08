import java.util.*;
public class lab2_q4
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n,s=0,d;
        n = in.nextInt();
        while(n!=0)
        {
            s = n%10+s;
            n=n/10;

        }
        System.out.println("The sum of the digit is");
        System.out.print(s);
    }


}

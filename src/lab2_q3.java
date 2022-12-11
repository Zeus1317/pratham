import java.util.*;
public class
lab2_q3 {
    public static void main(String[] args) {
    double bs,hra,da,gs;
    Scanner in= new Scanner(System.in);
        System.out.println("Enter the basic salary");
    bs = in.nextDouble();
    da = 0.4*bs;
    hra = 0.2*bs;
    gs = bs+da+hra;
        System.out.println(gs);

    }
}

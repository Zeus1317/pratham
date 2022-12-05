import java.util.*;
public class lab2_q5 {
    public static void main(String[] args) {
        double r, sa,va;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of hemishphere");
        r = in.nextDouble();


        sa= 3*Math.PI*r*r;
        va=(2.0/3.0)*Math.PI*Math.pow(r,3);
        System.out.println("Surface area:"+sa);
        System.out.println(" volume area:"+va);




    }



}

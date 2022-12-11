import java.util.*;
public class lab2_q6 {

    public static void main(String[] args) {
        double seconds,g=32.174,d, feet;
        System.out.println("Enter the number of seconds:+s");
        Scanner in = new Scanner(System.in);
        seconds = in.nextDouble();

        d= (0.5)*g*Math.pow(seconds,2);
        System.out.println("Distance travelled:");
        System.out.println(d);



    }

    }





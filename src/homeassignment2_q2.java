import java.util.Scanner;

public class homeassignment2_q2 {
    public static void main(String[] args) {
        int eggs;
        int gross;
        int aboveGross;
        int dozens;

        int extras;
        System.out.println("How many eggs do you have");
        Scanner sc = new Scanner(System.in);

        eggs = sc.nextInt();

        gross = eggs/144;

        aboveGross = eggs%144;

        dozens = aboveGross/12;

        extras = aboveGross%12;

        System.out.println("gross "+ gross);
        System.out.println("dozen "+dozens);
        System.out.println("extra "+extras);

    }
}

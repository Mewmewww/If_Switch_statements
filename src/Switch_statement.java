import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken dag har du lyst til at printe ud?");
        int dage = input.nextInt();
        //
        switch (dage) {
            case 1:
                System.out.println("Mandag");
                break;
            case 2:
                System.out.println("Tirsdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
        }
    }
}

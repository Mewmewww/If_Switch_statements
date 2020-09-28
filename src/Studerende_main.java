import java.util.Scanner;

public class Studerende_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print 1 for Lasse - 2 for Simon, 3 for Fredrik og 4 for Deniz");
        int person = input.nextInt();

        Studerende st1 = new Studerende();
        st1.navn = "Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";
        //st1.studieretning = "Datamatiker";

        Studerende st2 = new Studerende();
        st2.navn = "Simon";
        st2.alder = 20;
        st2.by = "Unknown";
        //st2.studieretning = "Datamatiker";

        Studerende st3 = new Studerende();
        st3.navn = "Fredrik";
        st3.alder = 22;
        st3.by = "Nykøbing Falster";
      //  st3.studieretning = "Datamatiker";

        Studerende st4 = new Studerende();
        st4.navn = "Deniz";
        st4.alder = 20;
        st4.by = "Vordingborg";
      //  st4.studieretning = "Datamatiker";

        switch (person) {
            case 1:
                System.out.println("Alder = " + st1.alder + " Navn = " + st1.navn + " By = " + st1.by);
                break;
            case 2:
                System.out.println("Alder = " + st2.alder + " Navn = " + st2.navn + " By = " + st2.by);
                break;
            case 3:
                System.out.println("Alder = " + st3.alder + " Navn = " + st3.navn + " By = " + st3.by);
                break;
            case 4:
                System.out.println("Alder = " + st4.alder + " Navn = " + st4.navn + " By = " + st4.by);
                break;
    }

    }

}

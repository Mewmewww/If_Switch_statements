import java.util.Scanner;

public class Studerende_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print 1 for Lasse - 2 for Simon, 3 for Fredrik og 4 for Deniz");
        int person = input.nextInt();

        Bil dyt = new Bil();

        Studerende st1 = new Studerende();
        st1.navn = "Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";


        Studerende st2 = new Studerende("Simon", 24, "Faxe");
        /*
        st2.navn = "Simon";
        st2.alder = 20;
        st2.by = "Unknown";
        */

        Studerende st3 = new Studerende("Fredrik", 22);
        /*
        st3.navn = "Fredrik";
        st3.alder = 22;
        st3.by = "Nykøbing Falster";
        */

        Studerende st4 = new Studerende("Deniz", 20, "Vordingborg");
        /*
        st4.navn = "Deniz";
        st4.alder = 20;
        st4.by = "Vordingborg";
        */

        switch (person) {
            case 1 -> System.out.println("Navn = " + st1.navn + " Alder = " + st1.alder + " By = " + st1.by);
            case 2 -> System.out.println("Navn = " + st2.navn + " Alder = " + st2.alder + " By = " + st2.by);
            case 3 -> System.out.println("Navn = " + st3.navn + " Alder = " + st3.alder + " By = " + st3.by);
            case 4 -> System.out.println("Navn = " + st4.navn + " Alder = " + st4.alder + " By = " + st4.by);
        }

    }

}

import java.util.Scanner;

public class Studerende {
    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;

    /*Studerende() {
        System.out.println("Et nyt objekt er instantieret af typen Studerennde");
        studieretning = "Datamatiker";
        campus = "Vordingborg";
    }*/

    public Studerende(String x, int y, String z) {
        this.navn = x;
        this.alder = y;
        this.by = z;
    }

}

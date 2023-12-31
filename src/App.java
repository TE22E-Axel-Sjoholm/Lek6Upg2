import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        System.out.println("Vilket number ska avrundas? ");

        int avrunda = tb.nextInt();
        int modulo = avrunda % 100;

        modulo = 100-modulo;
        avrunda += modulo;

        System.out.println("Det avrundas till "+avrunda);
        System.out.print("Skriv en täljare: ");
        int täljare = tb.nextInt();
        System.out.print("Skriv en nämnare: ");
        int nämnare = tb.nextInt();

        int helTal = täljare / nämnare;
        int rest = täljare % nämnare;

        System.out.println("Blandad form: " + helTal + " " + rest + "/" + nämnare);

        System.out.print("Ange antalet timmar: ");
        float timmar = tb.nextFloat();
        System.out.print("Ange antalet minuter: ");
        float minuter = tb.nextFloat();
        System.out.print("Ange antalet sekunder: ");
        float sekunder = tb.nextFloat();

        float timmarsumma = ((minuter/60)+((sekunder/60)/60)+timmar);
        float minutersumma = ((timmar*60)+(sekunder/60)+minuter);
        float sekundersumma = (((timmar*60)*60)+(minuter*60)+sekunder);

        System.out.print("Tidsomvandlingen ger: "+timmarsumma+"h = "+minutersumma+"m = "+sekundersumma+"s");

        tb.close();
    }
}

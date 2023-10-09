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
    }
}

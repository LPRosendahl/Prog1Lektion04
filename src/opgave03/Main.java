package opgave03;

public class Main {
    public static void main(String[] args) {
        littleTabel(7);
        System.out.println();
        udskrivAlleTabel();
    }


    public static void littleTabel(int tal) {
        /*Lav en metode der tager en parameter og udskriver den lille tabel for den parameter.
        Så for 7 udskrives. 7 14 21 28 35 42 49 56 63 70
        Du kan bruge metoden
        System.out.printf("%4d", number);
        Til at udskrive et heltal der fylder fire tegn.
        */
        int i = 1;

        while (i <= 10) {
            int produkt = tal * i;
            System.out.printf("%4d ", produkt);
            i++;
        }

    }

    public static void udskrivAlleTabel() {
        int n = 1;
        while (n <= 10) {
            System.out.println("\n");
            littleTabel(n); // bruger den gamle metode
            n++;

        }

    }
}

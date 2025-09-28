package opgave05;

public class Main {
    public static void main(String[] args) {
        mønsterA();
        mønsterB();
        mønsterC();
        mønsterD();


    }

    public static void mønsterA() {
        int vertikal = 1;
        while (vertikal <= 5) {
            int stjerner = 1;
            while (stjerner <= vertikal) {
                System.out.print("*");
                stjerner++;
            }
            System.out.println();
            vertikal++;
        }
    }


    public static void mønsterB() {
        int vertikal = 1;
        while (vertikal <= 5) {
            int stjerner = 5;
            while (stjerner >= vertikal) {
                System.out.print("*");
                stjerner--;
            }
            System.out.println();
            vertikal++;
        }
    }

    public static void mønsterC() {
        int vertikal = 1;
        while (vertikal <= 5) {
            int mellemrum = 5 - vertikal;
            int stjerner = vertikal;

            while (mellemrum > 0) {
                System.out.print(" ");
                mellemrum--;
            }

            while (stjerner > 0) {
                System.out.print("*");
                stjerner--;

            }
            System.out.println();
            vertikal++;
        }
    }


    public static void mønsterD() {
        int vertikal = 1;
        while (vertikal <= 5) {
            int mellemrum = vertikal - 1;
            int stjerner = 6 - vertikal;

            while (mellemrum > 0) {
                System.out.print(" ");
                mellemrum--;
            }

            while (stjerner > 0) {
                System.out.print("*");
                stjerner--;

            }
            System.out.println();
            vertikal++;
        }
    }
}

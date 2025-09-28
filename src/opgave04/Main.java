package opgave04;

public class Main {
    public static void main(String[] args) {
        /*Lav en metode power der tager to parameter og returnere den parameter
        opløftet til en potens af den anden parameter. Med andre ord
        skal I implementerer Math.pow metoden. Og I må selvfølgelig ikke bruge
        Math.pow metoden, men skal bruge en while løkke.
        Prøv at kalde din metode med parameterne 2 og 31 altså udregn. Overvej hvorfor du får det resultat.
         */
        power(2, 31);

    }

    public static void power(int primaryNumber, int potensNumber) {
        int counter = 1;
        int produkt = primaryNumber;

        while (counter < potensNumber){
            produkt *= primaryNumber;
            counter++;


        }
        System.out.println(produkt);
    }
}

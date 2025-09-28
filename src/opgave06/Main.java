package opgave06;

import java.util.Scanner;
/*Lav en metode der kan beregne tværsummer af et tal. En tværsum af et tal er hvert ciffer lagt sammen.

Så tværsummen af 345 er 3 + 4 + 5 = 12

Hint: 345 % 10 er 5 og 345 / 10 er 34 ved heltalsdivision.

 */
public class Main {
    public static void main(String[] args) {
        tværsum();
    }

    private static void tværsum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast tal du vil beregne tværsum af: ");
        int tal = scanner.nextInt();

        int crossSum = 0;
        while (tal > 0) {
            crossSum += tal % 10;
            tal = tal / 10;
        }
        System.out.println(crossSum);
    }


}



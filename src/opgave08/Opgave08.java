package opgave08;

public class Opgave08 {
    public static void main(String[] args) {
        int[] testTal = {34543, 9779, 37723, 12321, 1001};

        for (int tal : testTal) {
            if (isPalindromTal(tal)) {
                System.out.println(tal + " er et palindromtal.");
            } else {
                System.out.println(tal + " er ikke et palindromtal.");
            }
        }
    }

    public static boolean isPalindromTal(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;           // Hent sidste ciffer
            reversed = reversed * 10 + digit;  // Tilføj til omvendt tal
            number = number / 10;              // Fjern sidste ciffer
        }

        return original == reversed;
    }


}

//Et pallidrom tal er et heltal som er ens hvad enten det læses fra højre eller fra venstre.
//
//Så 34543 og 9779 er palidromer, men 37723 er ikke.
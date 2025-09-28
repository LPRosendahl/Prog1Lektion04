package opgave07;

public class Opgave07 {
    public static void main(String[] args) {
        int number = 5678;
        int reversed = reverseNumber(number);
        System.out.println(reversed);

    }
    private static int reverseNumber(int number){

        int reversed = 0;
        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }


        return reversed;
    }

}

//Lav en metode der reverse der tager et heltal som parameter og returnere et heltal hvor alle ciffer er byttet om.
//
//Så 5678 bliver til 8765
//
//Hintet fra opgave 6 kan også bruges her.
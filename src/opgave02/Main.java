package opgave02;

public class Main {
    public static void main(String[] args) {
        /*Implementerer en metoden evenNumbers, så den returnerer
        summen af alle lige tal mellem 2 og 100, begge inklusiv.
        Resultatet skulle gerne være 2550.*/

        System.out.println(evenNumbers());
        System.out.println(qubicNumbers());

    }

    public static int evenNumbers(){
            int number = 2;
            int sum = 0;
            while (number <= 100){
                sum = sum +  number;
                number += 2;

            }
            return sum;
    }

    public static int qubicNumbers(){
        int number = 1;
        int sum = 0;
        while (number * number <= 100){
            sum += number * number;
            number++;
        }
            return sum;
    }
    /*b)
    Implementerer en metoden qubicNumbers, så den returnerer summen af alle kvadrattal mindre end 100.
     Et kvadrattal er kvadratet af et heltal, de første er 1, 4, 9,...
     Resultatet skulle gerne give 385
     Ekstraopgave
     Kan I modificerer de to metoder, så de tager en parameter der angiver hvornår man skal stoppe,
     så man for eksempel kan angive at man vil have summen af alle lige tal optil 200?*/





}


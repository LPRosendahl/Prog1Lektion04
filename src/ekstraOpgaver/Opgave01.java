package ekstraOpgaver;

public class Opgave01 {
    /*Lav en for-løkke der udskriver alle de ulige tal fra 1 til 99 (inklusiv).
Dette kan gøres ved at tilføje kode i main()- metoden i klassen SimpelFor
(Kan findes på Canvas)
2. Lav en for-løkke der udskriver alle multiplum af 3 fra 300 ned til 3.
Dvs: 300, 297, 294 ...6, 3.
Dette kan gøres ved at tilføje kode i main()- metoden i klassen SimpelFor
     */
    public static void main(String[] args) {

        for(int ulligeTal = 1; ulligeTal <=99; ulligeTal+=2){

            System.out.printf("%4d", ulligeTal);


    }
        System.out.println();
        for(int multiplum = 300; multiplum >= 3; multiplum-=3){

            System.out.printf("%4d",multiplum);


        }


    }
}

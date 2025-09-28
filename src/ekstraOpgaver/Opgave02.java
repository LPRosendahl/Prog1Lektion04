package ekstraOpgaver;

import java.util.Scanner;

public class Opgave02 {
    public static void main(String[] args) {
        opgave2a();
        opgave2b();
        opgave2c();
        opgave2d();

    }

    private static void opgave2a() {
        //Indlæs antal tal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af tal: ");
        int antal = scanner.nextInt();
        System.out.println("Indtast " + antal + " tal: ");
        int størsteTal = Integer.MIN_VALUE;
        int mindsteTal = Integer.MAX_VALUE;
        int antalLigeTal = 0;
        int antalUligeTal = 0;

        for (int i = 0; i < antal; i++) {
            int tal = scanner.nextInt();
            if (tal > størsteTal) {
                størsteTal = tal;
            }
            if (tal < mindsteTal) {
                mindsteTal = tal;
            }
            if (tal % 2 == 0) {
                antalLigeTal++;
            } else {
                antalUligeTal++;
            }
        }
        System.out.println("Største tal er: " + størsteTal);
        System.out.println("Mindste tal er: " + mindsteTal);
        System.out.println("Lige tal: " + antalLigeTal);
        System.out.println("Antal ulige tal: " + antalUligeTal);

        scanner.close();
    }

    private static void opgave2b() {
        //Indlæs antal tal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af tal: ");
        int antal = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < antal; i++) {
            int tal = scanner.nextInt();
            sum = sum + tal;
            System.out.println(sum);
        }
        scanner.close();

    }

    private static void opgave2c() {
        //Indlæs antal tal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af tal: ");
        int antal = scanner.nextInt();


        int max = Integer.MIN_VALUE;
        int count = 0;
        System.out.println("Indtast " + antal + " tal: ");
        for (int i = 0; i < antal; i++) {
            int tal = scanner.nextInt();
            if (tal > max) {
                max = tal;
                count = 0;
            }
            if (tal == max) {
                count++;
            }
        }
        System.out.println("Det største tal er: " + max);
        System.out.println("Det største tal forekommer: " + count + " antal gange.");

        scanner.close();
    }

    private static void opgave2d() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af tal: ");
        int antal = scanner.nextInt();

        System.out.println("indtast " + antal + " tal");
        int forrigeTal = scanner.nextInt();
        int count = 1;

        for (int i = 1; i < antal; i++) {
            int tal = scanner.nextInt();
            if (tal == forrigeTal) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print(forrigeTal + " ");
                }
                count = 1;
            }
            forrigeTal = tal;
        }
        if (count > 1) {
            System.out.print(forrigeTal + " ");
        }
        scanner.close();

    }


}




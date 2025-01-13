import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seleziona il programma da eseguire:");
        System.out.println("1. Esercizio 1");
        System.out.println("2. Esercizio 2");

        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1 -> new Esercizio1().execute();
            //case 2 -> new Esercizio2().execute(); DA AGGIUNGERE Appena finisco il 2 esercizio
            default -> System.out.println("Scelta non valida. Terminazione del programma.");
        }

        scanner.close();
    }
}
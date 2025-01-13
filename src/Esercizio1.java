import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        // Generazione array casuale
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Array iniziale: " + Arrays.toString(array));

        while (true) {
            try {
                System.out.print("Inserisci un indice (0-4): ");
                int index = scanner.nextInt();

                System.out.print("Inserisci un valore (1-10, 0 per terminare): ");
                int value = scanner.nextInt();

                if (value == 0) {
                    System.out.println("Terminazione del programma.");
                    break;
                }

                array[index] = value; // Aggiorna il valore all'indice specifico
                System.out.println("Array aggiornato: " + Arrays.toString(array));

            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Errore: indice fuori dai limiti dell'array!", e);
                System.out.println("Errore: indice non valido. Riprova.");
            } catch (Exception e) {
                logger.error("Errore imprevisto!", e);
                System.out.println("Errore: input non valido. Riprova.");
                scanner.nextLine(); // Consuma l'input non valido
            }
        }

        scanner.close();
    }
}

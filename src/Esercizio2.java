import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Inserisci i km percorsi (0 per terminare): ");
                double kmPercorsi = scanner.nextDouble();
                if (kmPercorsi == 0) {
                    System.out.println("Terminazione del programma.");
                    break;
                }

                System.out.print("Inserisci i litri di carburante consumati: ");
                double litriConsumato = scanner.nextDouble();

                if (litriConsumato == 0) {
                    throw new ArithmeticException("Divisione per zero: i litri consumati non possono essere 0.");
                }

                double kmPerLitro = kmPercorsi / litriConsumato;
                System.out.printf("Hai percorso %.2f km/litro.%n", kmPerLitro);

            } catch (ArithmeticException e) {
                logger.error("Errore: divisione per zero!", e);
                System.out.println("Errore: non puoi dividere per zero.");
            } catch (Exception e) {
                logger.error("Errore imprevisto!", e);
                System.out.println("Errore: input non valido. Riprova.");
                scanner.nextLine(); // Consuma l'input non valido
            }
        }

        scanner.close();
    }
}

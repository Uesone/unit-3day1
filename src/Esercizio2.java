import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente di inserire tre parole
        System.out.print("Inserisci la prima parola: ");
        String primaStringa = scanner.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String secondaStringa = scanner.nextLine();

        System.out.print("Inserisci la terza parola: ");
        String terzaStringa = scanner.nextLine();


        String concatenazioneOrdine = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdine);


        String concatenazioneInverso = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInverso);

        scanner.close();
    }
}

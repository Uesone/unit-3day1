public class Main {

    // Metodo che moltiplica due interi e ritorna il loro prodotto
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo che concatena una stringa con un intero e ritorna la stringa risultante
    public static String concatena(String str, int num) {
        return str + num;
    }

    // Metodo che inserisce una stringa al terzo posto di un array di stringhe di cinque elementi
    // e sposta le stringhe precedenti dalla quarta e quinta posizione alla quinta e sesta
    public static String[] inserisciInArray(String[] array, String str) {
        String[] newArray = new String[6];

        // Copia i primi due elementi
        newArray[0] = array[0];
        newArray[1] = array[1];

        // Inserisce la nuova stringa al terzo posto
        newArray[2] = str;

        // Copia i rimanenti elementi
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }

    // Metodo main per testare i metodi
    public static void main(String[] args) {
        // Test del metodo moltiplica
        int risultatoMoltiplica = moltiplica(3, 4);
        System.out.println("Risultato di moltiplica(3, 4): " + risultatoMoltiplica);

        // Test del metodo concatena
        String risultatoConcatena = concatena("Numero: ", 7);
        System.out.println("Risultato di concatena(\"Numero: \", 7): " + risultatoConcatena);

        // Test del metodo inserisciInArray
        String[] arrayOriginale = {"a", "b", "c", "d", "e"};
        String[] arrayNuovo = inserisciInArray(arrayOriginale, "inserito");
        System.out.println("Risultato di inserisciInArray:");
        for (String s : arrayNuovo) {
            System.out.print(s + " ");
        }
    }
}

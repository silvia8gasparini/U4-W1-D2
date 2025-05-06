public class EsercizioIfElse {

    // Verifica se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    // Anno bisestile
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test stringaPariDispari
        String testStringa = "ciao!";
        System.out.println("La stringa \"" + testStringa + "\" ha lunghezza pari? " + stringaPariDispari(testStringa));

        // Test annoBisestile
        int testAnno = 2024;
        System.out.println("L'anno " + testAnno + " è bisestile? " + annoBisestile(testAnno));

        testAnno = 1900;
        System.out.println("L'anno " + testAnno + " è bisestile? " + annoBisestile(testAnno));

        testAnno = 2000;
        System.out.println("L'anno " + testAnno + " è bisestile? " + annoBisestile(testAnno));
    }
}

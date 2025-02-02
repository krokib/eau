/*
 * Epreuve eau - Majuscule sur deux
 * 
 * Créez un programme qui met en majuscule une lettre sur deux d’une
 * chaîne de caractères. Seule les lettres (A-Z, a-z) sont prises en compte.
 * 
 * Exemples d’utilisation :
 * $> python exo.py “Hello world !”
 * HeLlO wOrLd !
 * 
 * $> python exo.py 42
 * error
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau06 {
 
    private static boolean testArgument(String[] args) {
        boolean resultat = false;
        if (args.length != 0) {
            resultat = true;
            for (int i = 0; i < args.length; i++) {
                resultat &= args[i].matches("(.*[a-zA-Z].*)+");
            }
        }
        return resultat;
    }

    private static char getMaj(char c) {
        if (c >= 'a' && c <= 'z') {
            c -= ('a' - 'A');
        }
        return c;
    }

    private static char getMin(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += ('a' - 'A');
        }
        return c;
    }

    private static boolean isLettre(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static void majSurDeux(String[] args) {
        char[] arg;
        boolean setMaj = true;
        char car;
        for (String str : args) {
            arg = str.toCharArray();
            for (int i = 0; i < arg.length; i++) {
                if (isLettre(arg[i])) {
                    car = setMaj ? getMaj(arg[i]) : getMin(arg[i]);
                    setMaj = !setMaj;
                } else {
                    car = arg[i];
                }
                System.out.print(car);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        if (!testArgument(args)) {
            System.out.println("error");
        } else {
            majSurDeux(args);
        }
    }
 }
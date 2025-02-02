/*
 * Epreuve eau - String dans string
 * 
 * Créez un programme qui détermine si une chaîne de caractère se trouve
 * dans une autre.
 * 
 * Exemples d’utilisation :
 * $> python exo.py bonjour jour
 * true
 * 
 * $> python exo.py bonjour joure
 * false
 * 
 * $> python exo.py 42
 * error
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau05 {
 
    private static boolean stringDansString(String a, String b) {
        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();
        boolean resultat = false;
        for (int iB = 0; iB < strB.length; iB++) {
            for (int iA = 0; iA < strA.length; iA++) {
                if (strA[iA] == strB[iB] && strA.length - iA >= strB.length - iB) {
                    resultat = true;
                    for (int j = 1; j < strB.length - iB; j++) {
                        resultat &= (strA[iA + j] == strB[iB + j]);
                    }
                    if (resultat) {
                        return resultat;
                    }
                }
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("error");
        } else {
            System.out.println(stringDansString(args[0], args[1]));
        }
    }
 }
/*
 * Epreuve eau - Majuscule
 * 
 * Créez un programme qui met en majuscule la première lettre de chaque
 * mot d’une chaîne de caractères. Les autres lettres devront être en
 * minuscules. Les mots ne sont délimités que par un espace, une tabulation
 * ou un retour à la ligne.
 * 
 * Exemples d’utilisation :
 * $> python exo.py “bonjour mathilde, comment vas-tu ?!”
 * Bonjour Mathilde, Comment Vas-tu ?!
 * 
 * $> python exo.py 42
 * error
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau07 {
 
    private static boolean testArgument(String[] args) {
        if (args.length == 1) {
            return args[0].matches("(.*[a-zA-Z]+.*)");
        }
        return false;
    }

    private static boolean isLettre(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static char getMaj(char c) {
        if (c >= 'a' && c <= 'z') {
            c -= ('a' - 'A');
        }
        return c;
    }

    private static void majusculeDebutMot(String str) {
        char[] cars = str.toCharArray();
        boolean nouveauMot = true;
        for (int i = 0; i < cars.length; i++) {
            if (isLettre(cars[i]) && nouveauMot) {
                cars[i] = getMaj(cars[i]);
                nouveauMot = false;
            } else if (cars[i] == '\n' || cars[i] == '\t' || cars[i] == ' ') {
                nouveauMot = true;
            }
        }
        System.out.println(cars);
    }

    public static void main(String[] args) {
        if (!testArgument(args)) {
            System.out.println("error");
        } else {
            majusculeDebutMot(args[0]);
        }
    }
 }
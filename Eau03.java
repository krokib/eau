/*
 * Epreuve eau - Suite de Fibonacci
 * 
 * Créez un programme qui affiche le N-ème élément de la célèbre suite de
 * Fibonacci. (0, 1, 1, 2) étant le début de la suite et le premier élément étant à
 * l’index 0.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 3
 * 2
 * 
 * Afficher -1 si le paramètre est négatif ou mauvais.
 */

 public class Eau03 {
 
    private static boolean bonArgument(String[] args) {
        if (args.length == 1) {
            return args[0].matches("[0-9]+");
        } else {
            return false;
        }
    }

    private static int fibonacci(int n) {
        int resultat;
        switch (n) {
            case 0:
                resultat = 0;
                break;
            case 1:
                resultat = 1;
                break;
            default:
                resultat = fibonacci(n - 1) + fibonacci(n - 2);
                break;
        }
        return resultat;
    }

    public static void main(String[] args) {
        if (!bonArgument(args)) {
            System.out.println("-1");
        } else {
            System.out.println(fibonacci(Integer.parseInt(args[0])));
        }
    }
 }
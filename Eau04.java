/*
 * Epreuve eau - Prochain nombre premier
 * 
 * Créez un programme qui affiche le premier nombre premier supérieur au
 * nombre donné en argument.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 14
 * 17
 * 
 * Afficher -1 si le paramètre est négatif ou mauvais.
 */

 public class Eau04 {
 
    private static boolean bonArgument(String[] args) {
        if (args.length == 1) {
            return args[0].matches("[0-9]+");
        }
        return false;
    }

    private static boolean estPremier(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int prochainNombrePremier(int n) {
        int resultat = n;
        while (!estPremier(resultat)) {
            resultat++;
        }
        return resultat;
    }

    public static void main(String[] args) {
        if (!bonArgument(args)) {
            System.out.println("-1");
        } else {
            System.out.println(prochainNombrePremier(Integer.parseInt(args[0])));
        }
    }
 }
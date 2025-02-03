/*
 * Epreuve eau - Index wanted
 * 
 * Créez un programme qui affiche le premier index d’un élément recherché
 * dans un tableau. Le tableau est constitué de tous les arguments sauf le
 * dernier. L’élément recherché est le dernier argument. Afficher -1 si l’
 * élément n’est pas trouvé.
 * 
 * Exemples d’utilisation :
 * $> python exo.py Ceci est le monde qui contient Charlie un homme sympa Charlie
 * 6
 * 
 * $> python exo.py test test test
 * 0
 * 
 * $> python exo.py test boom
 * -1
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau10 {

    private static boolean sontEgales(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        if (aArray.length != bArray.length) {
            return false;
        } else {
            for (int i = 0; i < aArray.length; i++) {
                if (aArray[i] != bArray[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    private static void indexWanted(String[] args) {
        int index;
        String pattern = args[args.length - 1];
        for (index = 0; index < args.length; index++) {
            if (sontEgales(args[index], pattern)) {
                break;
            }
        }
        System.out.println((index != args.length - 1) ? index : -1);
    }
 
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("error");
        } else {
            indexWanted(args);
        }
    }
 }
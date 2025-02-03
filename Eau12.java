/*
 * Epreuve eau - Tri à bulle
 * 
 * Créez un programme qui trie une liste de nombres. Votre programme
 * devra implémenter l’algorithme du tri à bulle.
 * 
 * Vous utiliserez une fonction de cette forme (selon votre langage) :
 * my_bubble_sort(array) {
 *      # votre algorithme
 *      return (new_array)
 * }
 * 
 * Exemples d’utilisation :
 * $> python exo.py 6 5 4 3 2 1
 * 1 2 3 4 5 6
 * 
 * $> python exo.py test test test
 * error
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 * Wikipedia vous présentera une belle description de cet algorithme de tri.
 */

 public class Eau12 {

    private static boolean testArguments(String[] args) {
        if (args.length < 1) {
            return false;
        } else {
            for (String str : args) {
                if (!str.matches("[+-]?[0-9]+")) {
                    return false;
                }
            }
            return true;
        }
    }
 
    private static int[] triBulles(int[] ints) {
        int[] instTri = new int[ints.length];
        for (int i = 0; i <ints.length; i++) {
            instTri[i] = ints[i];
        }
        int varTMP;
        for (int i = ints.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (instTri[j] > instTri[j + 1]) {
                    varTMP = instTri[j];
                    instTri[j] = instTri[j + 1];
                    instTri[j + 1] = varTMP;
                }
            }
        }
        return instTri;
    }

    private static void afficheIntArray(int[] ints) {
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        if (!testArguments(args)) {
            System.out.println("error");
        } else {
            int[] ints = new int[args.length];
            for (int i = 0; i < args.length;  i++) {
                ints[i] = Integer.parseInt(args[i]);
            }
            afficheIntArray(triBulles(ints));
        }
    }
 }
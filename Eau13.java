/*
 * Epreuve eau - Tri par sélection
 * 
 * Créez un programme qui trie une liste de nombres. Votre programme
 * devra implémenter l’algorithme du tri par sélection.
 * Vous utiliserez une fonction de cette forme (selon votre langage) :
 * my_select_sort(array) {
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

 public class Eau13 {
 
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
 
    private static int[] triSelection(int[] ints) {
        int[] instTri = new int[ints.length];
        for (int i = 0; i <ints.length; i++) {
            instTri[i] = ints[i];
        }
        int indexMin;
        int min;
        for (int i = 0; i < ints.length - 1; i++) {
            indexMin = i;
            for (int j = i+ 1; j < ints.length; j++) {
                if (instTri[j] < instTri[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                min = instTri[indexMin];
                instTri[indexMin] = instTri[i];
                instTri[i] = min;
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
            for (int i = 0; i < args.length; i++) {
                ints[i] = Integer.parseInt(args[i]);
            }
            afficheIntArray(triSelection(ints));
        }
    }
 }
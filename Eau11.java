/*
 * Epreuve eau - Différence minimum absolue
 * 
 * Créez un programme qui affiche la différence minimum absolue entre
 * deux éléments d’un tableau constitué uniquement de nombres. Nombres
 * négatifs acceptés.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 5 1 19 21
 * 2
 * 
 * $> python exo.py 20 5 1 19 21
 * 1
 * 
 * $> python exo.py -8 -6 4
 * 2
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau11 {
 
    private static boolean testArguments(String[] args) {
        if (args.length < 2) {
            return false;
        } else {
            for (String str : args) {
                if (!str.matches("-?[0-9]+")) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int diffMinAbs(int a, int b) {
        return (a - b >= 0) ? a - b : b - a;
    }

    private static void diffMinAbs(int[] ints) {
        int diffMinAbs = diffMinAbs(ints[0], ints[1]);
        int difference;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                difference = diffMinAbs(ints[i], ints[j]);
                diffMinAbs = (difference < diffMinAbs) ? difference : diffMinAbs;
            }
        }
        System.out.println(diffMinAbs);
    }

    public static void main(String[] args) {
        if (!testArguments(args)) {
            System.out.println("error");
        } else {
            int[] ints = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                ints[i] = Integer.parseInt(args[i]);
            }
            diffMinAbs(ints);
        }
    }
 }
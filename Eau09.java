/*
 * Epreuve eau - Entre min et max
 * 
 * Créez un programme qui affiche toutes les valeurs comprises entre deux
 * nombres dans l’ordre croissant. Min inclus, max exclus.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 20 25
 * 20 21 22 23 24
 * 
 * $> python exo.py 25 20
 * 20 21 22 23 24
 * 
 * $> python exo.py hello
 * error
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau09 {
 
    private static boolean testArguments(String[] args) {
        if (args.length != 2) {
            return false;
        } else if (!args[0].matches("[0-9]+") || !args[1].matches("[0-9]+")) {
            return false;
        } else {
            return Integer.parseInt(args[0]) != Integer.parseInt(args[1]);
        }
    }

    private static void entreMinMax(int a, int b) {
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        for (int i = min; i < max; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        if (!testArguments(args)) {
            System.out.println("error");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            entreMinMax(a, b);
        }
    }
 }
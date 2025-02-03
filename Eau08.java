/*
 * Epreuve eau - Chiffres only
 * 
 * Créez un programme qui détermine si une chaîne de caractères ne
 * contient que des chiffres.
 * 
 * Exemples d’utilisation :
 * $> python exo.py “4445353”
 * true
 * 
 * $> python exo.py 42
 * true
 * 
 * $> python exo.py “Bonjour 36”
 * false
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau08 {
 
    private static boolean isChiffre(char c) {
        return (c >= '0' && c <= '9');
    }

    private static void chiffreOnly(String str) {
        boolean chiffreOnly = true;
        for (char c : str.toCharArray()) {
            if (!(chiffreOnly = isChiffre(c))) {
                break;
            }
        }
        System.out.println(chiffreOnly);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("error");
        } else {
            chiffreOnly(args[0]);
        }
    }
 }
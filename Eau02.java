/*
 * Epreuve eau - Paramètres à l’envers
 * 
 * Créez un programme qui affiche ses arguments reçus à l’envers.
 * 
 * Exemples d’utilisation :
 * $> python exo.py “Suis” “Je” “Drôle”
 * Drôle
 * Je
 * Suis
 * 
 * $> python exo.py ha ho
 * ho
 * ha
 * 
 * $> python exo.py “Bonjour 36”
 * Bonjour 36
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau02 {
 
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("error");
        } else {
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        }
    }
 }
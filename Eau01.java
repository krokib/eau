/*
 * Epreuve eau - Combinaisons de 2 nombres
 * 
 * Créez un programme qui affiche toutes les différentes combinaisons de
 * deux nombres entre 00 et 99 dans l’ordre croissant.
 * 
 * Exemples d’utilisation :
 * $> python exo.py
 * 00 01, 00 02, 00 03, 00 04, ... , 00 99, 01 02, ... , 97 99, 98 99
 */

 public class Eau01 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (i < 10) {
                    System.out.print(0);
                }
                System.out.print(i + " ");
                if (j < 10) {
                    System.out.print(0);
                }
                System.out.print(j);
                if (i == 98 && j == 99) {
                    break;
                }
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
 }
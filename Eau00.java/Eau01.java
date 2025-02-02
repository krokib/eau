/*
 * Epreuve eau - Combinaisons de 3 chiffres
 * 
 * Créez un programme qui affiche toutes les différentes combinaisons
 * possibles de trois chiffres dans l’ordre croissant, dans l’ordre croissant. La
 * répétition est volontaire.
 * 
 * Exemples d’utilisation :
 * $> python exo.py
 * 012, 013, 014, 015, 016, 017, 018, 019, 023, 024, ... , 789
 * $>
 * 
 * 987 n’est pas là parce que 789 est présent.
 * 020 n’est pas là parce que 0 apparaît deux fois.
 * 021 n’est pas là parce que 012 est présent.
 * 000 n’est pas là parce que cette combinaison ne comporte pas exclusivement
 * des chiffres différents les uns des autres.
 */

 public class Eau01 {
 
    public static void main(String[] args) {
        for (int i= 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                for (int k = j + 1; k < 10; k++) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    if (i == 7 && j == 8 && k == 9) {
                        continue;
                    }
                    System.out.print(", ");
                }
            }
        }
        System.out.println("");
    }
 }
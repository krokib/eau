/*
 * Epreuve eau - Par ordre Ascii
 * 
 * Créez un programme qui trie les éléments donnés en argument par ordre
 * ASCII.
 * 
 * Exemples d’utilisation :
 * $> python exo.py Alfred Momo Gilbert
 * Alfred Gilbert Momo
 * 
 * $> python exo.py A Z E R T Y
 * A E R T Y Z
 * 
 * Afficher error et quitter le programme en cas de problèmes d’arguments.
 */

 public class Eau14 {

    private static boolean sontTrieesASCII(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int lenMin = (aArray.length <= bArray.length)? aArray.length : bArray.length;
        for (int i = 0; i < lenMin; i++) {
            if (aArray[i] == bArray[i]) {
                continue;
            }
            return aArray[i] < bArray[i];
        }
        return true;
    }

    private static String[] triASCII(String[] strs) {
        String[] strsTRI = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            strsTRI[i] = strs[i];
        }

        int indexMin;
        String strMin;
        for (int i = 0; i < strsTRI.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < strsTRI.length; j++) {
                if (!sontTrieesASCII(strsTRI[indexMin], strsTRI[j])) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                strMin = strsTRI[indexMin];
                strsTRI[indexMin] = strsTRI[i];
                strsTRI[i] = strMin;
            }
        }

        return strsTRI;
    }
 
    private static void afficheStringArray(String[] strs) {
        for (String str : strs) {
            System.out.print(str + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("error");
        } else {
            afficheStringArray(triASCII(args));
        }
    }
 }
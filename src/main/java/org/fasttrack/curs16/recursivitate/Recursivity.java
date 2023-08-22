package org.fasttrack.curs16.recursivitate;

public class Recursivity {

    public static void main(String[] args) {
        System.out.println(sumOfNumbersTilLimit(10));
        System.out.println(sumRecursiv(10));

        System.out.println(palindromSimplu("madam"));
        System.out.println("-----");
        System.out.println(palindromRecursiv("madam"));
        System.out.println("-----");
        System.out.println(palindromSimplu("123456789"));
        String longSwedishWord = "saippuakivikauppias";

        System.out.println(palindromSimplu(longSwedishWord));
        System.out.println(palindromRecursiv(longSwedishWord));

        //palindrom
        //madam,
    }

    private static boolean palindromSimplu(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(word.charAt(i)));
            System.out.println("curr: " + reverse);
        }
        return word.equals(reverse);
    }

    private static boolean palindromRecursiv(String word) {
        System.out.println("rec: " + word);
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        //madam
        //01234 = 5
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return palindromRecursiv(word.substring(1, word.length() - 1));
        }
        return false;
    }

    //1 + 2 + 3 + ......+ (n-2) + (n-1) + n => [n * (n + 1)] / 2
    public static int sumOfNumbersTilLimit(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursiv(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursiv(n - 1);
        }
    }


    //n + sumRec(n-1) -> n + (n-1) + sumRec(n-2) -> n + (n - 1) + ....... + 2 + 1
}

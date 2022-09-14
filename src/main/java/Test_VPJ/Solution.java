package Test_VPJ;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

       System.out.println(isValid(input()));
    }

      public static boolean isValid(String s) {

        boolean spellCheck = false;
        char[] charArray = s.toCharArray();
        int k = 1;

        if (charArray.length == 1){ spellCheck = false;}
        else
for (int i = 0; i < charArray.length; i = i + 2) {
            if ((charArray[i] == '(' && charArray[k] == ')')
                    || (charArray[i] == '{' && charArray[k] == '}')
                    || (charArray[i] == '[' && charArray[k] == ']')) {
                spellCheck = true;
                if ((k+2)< charArray.length){k = k+2;}

            } else {
                spellCheck = false;
            }

                   }
        return spellCheck;
    }

    static String input() {
        System.out.println("Enter some bracket characters:  ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        while (!s.matches("[(){}\\[\\] ]+")) {
            System.out.println("ERROR: invalid character entered ");
            System.out.println("Please enter only some of these '(', ')', '{', '}', '[' or ']':  ");
            s = input.nextLine();
        }

        return s;
    }
}

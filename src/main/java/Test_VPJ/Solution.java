package Test_VPJ;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isValid(input()));
    }

    public static boolean isValid(String s) {

       char[] charArray = s.toCharArray();

        if (charArray.length %2 != 0) {
            return false;
        } else {
            for (int i = 0; i < charArray.length; i++) {
                if ((charArray[i] == '(' && charArray[i+1] == ')')
                        || (charArray[i] == '{' && charArray[i+1] == '}')
                        || (charArray[i] == '[' && charArray[i+1] == ']')) {
                                     i++;
                } else {
                    return false;
                }

            }}
        return true;
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

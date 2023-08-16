/* Write a java program which contains a method that translates any string with
four characters, which can either be a word, or a four digit number, or a
collection of random characters, into its ASCII code equivalent, with spaces in
between. (For example, if you gave yams to the method, it should return
121 97 109 115, because each number corresponds to a characters ASCII
value.*/

import java.util.*;
class ASCIITranslator 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine(); // Input string to translate
        String translated = translateTo ASCII(input);
        System.out.println("The ASCII code equivalent of \"" + input + "\" is: " + translated);
    }

    public static String translateToASCII(String input) 
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i += 4) 
        {
            String substring = input.substring(i, Math.min(i + 4, input.length()));
            for (int j = 0; j < substring.length(); j++) 
            {
                char c = substring.charAt(j);
                int ascii = (int) c; // Get ASCII value of character
                sb.append(ascii);
                if (j < substring.length() - 1) {
                    sb.append(" ");
                }
            }
            if (i < input.length() - 4) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

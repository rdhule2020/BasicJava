
package Interview_Programs;
/*
 * 
 * 
 * import java.util.Scanner;
 * 
 * public class ExpandAString { public static void main(String[] args) { //
 * Scanner sc = new Scanner(System.in); // System.out.print("Enter input: "); //
 * String input = sc.nextLine(); // sc.close();
 * 
 * String input = "a2b3c4d5";
 * 
 * StringBuilder output = new StringBuilder();
 * 
 * for (int i = 0; i < input.length(); i++) { char ch = input.charAt(i);
 * 
 * // Check if the current character is a letter if (Character.isLetter(ch)) {
 * // Next character should be a digit if (i + 1 < input.length() &&
 * Character.isDigit(input.charAt(i + 1))) { int count =
 * Character.getNumericValue(input.charAt(i + 1)); for (int j = 0; j < count;
 * j++) { output.append(ch); } } } }
 * 
 * System.out.println("Output: " + output.toString()); } }
 * 
 * 
 * 
 * 
 */





class ExpandAString {
    public static void main(String[] args) {
        String input = "a2b3c4d5";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                int count = Character.getNumericValue(input.charAt(i + 1));

                for (int j = 0; j < count; j++) {
                    output.append(ch);
                }

                i++; // skip the digit since it's already processed
            }
        }

        System.out.println("Output: " + output);
    }
}

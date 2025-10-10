package B_12Sept;

public class HalfString_1 {

    public static void main(String[] args) {
        String s = "Testing Java Automation";

        // Split into two parts
        String firstPart = "Testing ";
        String secondPart = s.substring(8); // Gets "Java"

        // Reverse second part
        String reversed = "";
        for (int i = secondPart.length() - 1; i >= 0; i--) {
            reversed += secondPart.charAt(i);
        }

        // Print final result
        System.out.println(firstPart + reversed);
    }
}
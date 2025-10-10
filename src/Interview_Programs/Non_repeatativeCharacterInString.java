package Interview_Programs;
public class Non_repeatativeCharacterInString {

    public static void main(String[] args) {
        String s = "Automation";

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First non-repeating character: " + current);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

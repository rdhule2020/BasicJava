/*
 * package BasicLearnings;
 * 
 * import java.util.Arrays;
 * 
 * public class AnagramStrings {
 * 
 * public static void main(String[] args) {
 * 
 * String s1 = "listen"; String s2 = "silent";
 * 
 * if(isAnagram(s1,s2)) { System.out.println(s1 +"&"+ s2 +"Are anagram" ); }else
 * { System.out.println(s1 +"&"+ s2 +"Are not anagram" );
 * 
 * }
 * 
 * }
 * 
 * private static boolean isAnagram(String s1, String s2) { s1 =
 * s1.replaceAll("\\s","").toLowerCase(); System.out.println(s1); s2=
 * s2.replaceAll("\\s", "").toLowerCase(); System.out.println(s2);
 * 
 * if (s1.length()!=s2.length()) return false;
 * 
 * 
 * char[] arr1 = s1.toCharArray(); System.out.println(arr1); char[] arr2=
 * s2.toCharArray(); System.out.println(arr2); Arrays.sort(arr1);
 * Arrays.sort(arr2); System.out.println(arr1); System.out.println(arr2); return
 * Arrays.equals(arr1, arr2);
 * 
 * }
 * 
 * }
 */
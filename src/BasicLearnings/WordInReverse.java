//package BasicLearnings;
//
//public class WordInReverse {
//
//	public static void main(String[] args) {
//		
//		String name = " Rahul Dhule ";
//		String [] namearray = name.split(" ");
//		String reverseString = "";
//		
//		for(String w:namearray) {
//			String reverseWords ="";
//			
//			for(int i =w.length()-1;i>=0;i--) {
//				reverseWord= reverseWord+w.charAt(i);
//			}
//			reverseString =reverseString+reverseWord+" ";
//		}
//		System.out.println();
////		
//		
//	}
//
//}
package BasicLearnings;

public class WordInReverse {

    public static void main(String[] args) {
        
        String name = " Rahul Dhule ";
        String[] nameArray = name.trim().split(" ");
        String reverseString = "";
        
        for (String w : nameArray) {
            String reverseWord = "";
            
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        
        System.out.println(reverseString.trim());
    }
}


//for(int i=0; i<2 ; i++) 
//	{
//		if(namearray[i].equals("Rahul")) 
//		{
//			System.out.println(namearray[i]);
//			System.out.println(i);
//		}else
//		{
//			char[]s1 = namearray[i].toCharArray();
//			for(int j= s1.length-1; j>=0;j--)
//				
//			{
//			System.out.println(s1[j]);
//			
//			}
//		}
//	}
package StringPrograms;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String input = "I am am learning learning Java Java programming";
		String []words = input.split(" ");
		String result ="";
		
		for(int i=0; i<words.length;i++) {
			 boolean isDuplicate=false;
			 
			 for(int j=0;j<i;j++)
			 {
				 if(words[i].equals(words[j])){
					isDuplicate=true;
					break;
				 }
			 }
			 if(!isDuplicate)
				 result = result + words[i]+ " ";
		}
		System.out.println("Original String :"+ input);
		System.out.println("FInal String :" + result.trim());
	}
}

<<<<<<< HEAD
public class Cheers {
    public static void main(String[] args) {

        String spell = args[0];
        int count = Integer.parseInt(args[1]); 

        String cheeringWord = spell.toUpperCase();

        final String SPECIAL_LETTERS = "AEFHILMNORSX";

        String article;

        for (int i = 0; i < cheeringWord.length(); i++) {
            char currentChar = cheeringWord.charAt(i);

            if (SPECIAL_LETTERS.indexOf(currentChar) >= 0) { 
                article = "an";
            } else {
                article = "a";
            }
            
            System.out.println("Give me " + article + " " + currentChar + ": " + currentChar + "!");
        } 

        
        System.out.println("What does that spell?");
        
     
        for (int i = 0; i < count; i++) {
            System.out.println(cheeringWord + "!!!");
        }
    }
}

=======
//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
        }
}
>>>>>>> f5de349671672dfb71c17b605b2edaaaaacd06a6

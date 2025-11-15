public class Cheers {
    public static void main(String args[]) {

        String spell = args[0];
        int count = Integer.parseInt(args[1]); 

        String cheeringWord = spell.toUpperCase();

        final String SPECIAL_LETTERS = "AEFHILMNORSX"; // you haven't learned 'final' + use camel case :)

        String article;

        for (int i = 0; i < cheeringWord.length(); i++) {
            char currentChar = cheeringWord.charAt(i);

            if (SPECIAL_LETTERS.indexOf(currentChar) >= 0) { 
                article = "an ";
            } else {
                 article = "a  ";   
             }
            
            System.out.println("Give me " + article + currentChar + ": " + currentChar + "!");        } 

        
        System.out.println("What does that spell?");
        
     
        for (int i = 0; i < count; i++) {
            System.out.println(cheeringWord + "!!!");
        }

    }

    }

<<<<<<< HEAD
// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("שימוש: java Collatz <N> <mode>");
            System.out.println("יש לספק את N (מספר שלם) ואת mode ('v' או 'c').");
            return; 
        }

        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("שגיאה: הארגומנט הראשון (N) חייב להיות מספר שלם תקין.");
            return;
        }

        String mode = args[1];
        boolean isVerbose = mode.equals("v");
        boolean isConcise = mode.equals("c");

        if (!isVerbose && !isConcise) {
            System.out.println("שגיאה: mode חייב להיות 'v' (מפורט) או 'c' (תמציתי).");
            return;
        }

        for (int seed = 1; seed <= N; seed++) {
            long currentNumber = seed; 
            int steps = 0;

            if (isVerbose) {
                System.out.print(seed);
            }
            
            while (currentNumber != 1) {
                
                if (currentNumber % 2 == 0) {
                    currentNumber = currentNumber / 2;
                } else {
                    currentNumber = 3 * currentNumber + 1;
                }
                
                steps++; 
                
                if (isVerbose) {
                    System.out.print(" " + currentNumber);
                }
            }

            if (isVerbose) {
                System.out.println(" (" + steps + ")");
            }
        } 

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
=======
// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
	}
}
>>>>>>> f5de349671672dfb71c17b605b2edaaaaacd06a6

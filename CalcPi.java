
public class CalcPi { 

    public static void main(String [] args) { 
        

        int numTerms;
        try {
            numTerms = Integer.parseInt(args[0]);
            if (numTerms < 0) {
                 System.out.println("שגיאה: מספר האיברים חייב להיות אי-שלילי.");
                 return;
            }
        } catch (NumberFormatException e) {
             System.out.println("שגיאה: הקלט אינו מספר שלם תקין.");
             return;
        }

        double piApproximation = calculatePi(numTerms);

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApproximation);

    } 


    public static double calculatePi(int numTerms) {
        if (numTerms <= 0) {
            return 0.0;
        }

        double sum = 0.0; 
        int sign = 1; 

        for (int i = 0; i < numTerms; i++) {
            
            double denominator = 2.0 * i + 1.0; 
            
            sum += sign * (1.0 / denominator); 
            
            sign = -sign; 
        }

        return 4.0 * sum;
    } 

}


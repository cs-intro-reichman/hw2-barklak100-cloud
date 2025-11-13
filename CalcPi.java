public class CalcPi {
    
    public static double calculatePi(int iterations) {
        double piApproximation = 0.0;
        for (int i = 0; i < iterations; i++) {
            double term = Math.pow(-1, i) / (2.0 * i + 1.0);
            piApproximation += term;
        }
        return 4.0 * piApproximation;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }

        try {
            int iterations = Integer.parseInt(args[0]);

            double javaPi = Math.PI;
            double approximatedPi = calculatePi(iterations);

            System.out.println("pi according to Java: " + javaPi);

            String piString = String.valueOf(approximatedPi);
            
            System.out.printf("pi, approximated: %18s%n", piString);

        } catch (NumberFormatException e) {
        }
    }
}
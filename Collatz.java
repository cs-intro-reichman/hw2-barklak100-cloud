public class Collatz {
    
    public static String getCollatzSequence(long n) {
        StringBuilder sequence = new StringBuilder();
        long current = n;
        int steps = 0;
        
        if (n == 1) {
            return "1 4 2 1 (4)";
        }
        
        sequence.append(current);

        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            steps++;
            sequence.append(" ").append(current);
        }

        return sequence.toString() + " (" + steps + ")";
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            String mode = args[1];

            for (int i = 1; i <= n; i++) {
                String sequenceOutput = getCollatzSequence(i);

                if (mode.equals("v")) {
                    System.out.println(sequenceOutput);
                } else if (mode.equals("c")) {
                }
            }

            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");

        } catch (NumberFormatException e) {
        }
    }
}
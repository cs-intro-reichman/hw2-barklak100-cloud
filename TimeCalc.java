public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        String startTime = args[0];
        String minutsToAdd = args[1];

        String hhStr = startTime.substring(0, 2);
        String mmStr = startTime.substring(3, 5);

        int intialHour = Integer.parseInt(hhStr);
        int intialMinutes = Integer.parseInt(mmStr);
        int minutToA = Integer.parseInt(minutsToAdd); 
        
        int intialTotalminutes = (intialHour * 60) + intialMinutes;
        int totalMinutes = intialTotalminutes + minutToA;
        int totalHour = totalMinutes / 60;
        int newHour = totalHour % 24;
        int newMinutes = totalMinutes % 60;
        String result = String.format("%02d:%02d", newHour, newMinutes);
        System.out.println(result);
	}
}

// great namings!

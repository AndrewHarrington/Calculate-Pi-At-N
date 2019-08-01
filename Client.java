public class Client {
    /**
     * Runs the program
     * @param args - System parameters
     */
    public static void main(String args[]) {

        long duration = System.currentTimeMillis();
        final int num = 2;	// nth number of pi to print out

        CalcPiAtN calc = new CalcPiAtN();

        System.out.println("Decimal digits of pi at position " + num + ": " + calc.getDecimal(num) + "\n");

        duration = System.currentTimeMillis() - duration;
        System.out.println("Duration: " + duration + " ms");
    }
}

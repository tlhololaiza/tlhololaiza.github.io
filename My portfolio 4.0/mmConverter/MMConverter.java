public class MMConverter {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the value in millimeters as a command line argument.");
            return;
        }

        try {
            double millimeters = Double.parseDouble(args[0]);

            double kilometers = millimeters / 1000000.0;
            double meters = millimeters / 1000.0;
            double centimeters = millimeters / 10.0;

            System.out.println(millimeters + " mm is equal to:");
            System.out.println(kilometers + " km");
            System.out.println(meters + " m");
            System.out.println(centimeters + " cm");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number for millimeters.");
        }
    }
}

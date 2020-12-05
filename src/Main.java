public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000;
        int oneMilePrice = 20;
        if (ticketPrice > 0 && oneMilePrice != 0) {
            int totalMiles = ticketPrice/oneMilePrice;
            System.out.println(totalMiles);
        } else {
            System.out.println("Something went wrong, please contact our call-center!");
        }
    }
}
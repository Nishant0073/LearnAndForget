public class Client {
    public static void main(String[] args) {
        SportsVehical sportsVehical = new SportsVehical(new SportsStrategy());
        PassengerVehical passengerVehical  = new PassengerVehical(new SportsStrategy()); // we can use any strategy
        sportsVehical.drive();
        passengerVehical.drive();
    }
}

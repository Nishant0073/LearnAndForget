public class NishantPhone implements WeatherObserver{
    private final String phoneOwner = "Nishant";

    @Override
    public void update(WeatherData weatherData) {
        System.out.println(phoneOwner + " Received new update: "+weatherData.getTemprature() +" , "+ weatherData.getHumedity());
    }

    
}

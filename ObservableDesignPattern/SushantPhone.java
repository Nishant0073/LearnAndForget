public class SushantPhone  implements WeatherObserver{
    private final String phoneOwner = "Sushant";

    @Override
    public void update(WeatherData weatherData) {
        System.out.println(phoneOwner + " Received new update: "+weatherData.getTemprature() +" , "+ weatherData.getHumedity());
    }

    
}

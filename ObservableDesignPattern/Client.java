public class Client {
    public static void main(String[] args) {
        WeatherPublisherConcreade weatherPublisherConcreade = new WeatherPublisherConcreade();
        NishantPhone nishantPhone = new NishantPhone();
        SushantPhone sushantPhone = new SushantPhone();
        weatherPublisherConcreade.add(nishantPhone);
        weatherPublisherConcreade.add(sushantPhone);
        weatherPublisherConcreade.SetWeather(new WeatherData(20,100));
        weatherPublisherConcreade.remove(sushantPhone);
        weatherPublisherConcreade.SetWeather(new WeatherData(22,110));

    }
}

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisherConcreade  implements WeatherPublisher{
    private List<WeatherObserver> weatherObservers;
    private WeatherData weatherData;

    public WeatherPublisherConcreade() {
        this.weatherObservers =  new ArrayList<>();
    }

    @Override
    public void add(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void remove(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(weatherData);
        }
    }

    @Override
    public void SetWeather(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }
}

public interface WeatherPublisher {
    void add(WeatherObserver weatherObserver);
    void remove(WeatherObserver weatherObserver);
    void notifyObservers();
    void SetWeather(WeatherData weatherData);
}


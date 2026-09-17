package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier notifier;

    public WeatherTracker(Notifier notifier) {
        this.notifier = notifier;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = notifier.generateWeatherAlert(weatherDescription);
        System.out.println(alert);
    }
}
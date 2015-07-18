package google.temperatureapp.model;

public class CurrentModel {

    public final long time;
    public final String summary;
    public final String temperature;
    public final String humidity;

    public CurrentModel(long time, String summary, String temperature, String humidity) {
        this.time = time;
        this.summary = summary;
        this.temperature = temperature;
        this.humidity = humidity;
    }
}

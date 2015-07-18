package google.temperatureapp.model;

public class HourlyDataModel {

    public final long time;
    public final String summary;
    public final double temperature;

    public HourlyDataModel(long time, String summary, double temperature) {
        this.time = time;
        this.summary = summary;
        this.temperature = temperature;
    }
}

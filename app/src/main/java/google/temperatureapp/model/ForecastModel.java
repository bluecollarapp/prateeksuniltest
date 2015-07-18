package google.temperatureapp.model;

public class ForecastModel {

    public final String timezone;
    public final CurrentModel currently;
    public final HourlyModel hourly;

    public ForecastModel(String timezone, CurrentModel currently, HourlyModel hourly) {
        this.timezone = timezone;
        this.currently = currently;
        this.hourly = hourly;
    }
}


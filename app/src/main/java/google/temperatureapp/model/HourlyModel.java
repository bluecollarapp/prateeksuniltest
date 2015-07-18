package google.temperatureapp.model;

public class HourlyModel {

    public final String summary;
    public final HourlyDataModel[] data;

    public HourlyModel(String summary, HourlyDataModel[] data) {
        this.summary = summary;
        this.data = data;
    }
}

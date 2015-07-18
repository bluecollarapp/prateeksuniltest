package google.temperatureapp.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import google.temperatureapp.R;

public class TempAdapter extends BaseAdapter {

    private Context context;
    private HourlyDataModel[] hourlyDataModels;

    public TempAdapter(Context context, HourlyDataModel[] hourlyDataModels) {
        this.context = context;
        this.hourlyDataModels = hourlyDataModels;
    }

    @Override
    public int getCount() {
        return hourlyDataModels.length;
    }

    @Override
    public Object getItem(int position) {
        return hourlyDataModels[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.row_temp, viewGroup, false);
        }

        HourlyDataModel hourlyDataModel = hourlyDataModels[position];

        TextView timeTextView = (TextView) view.findViewById(R.id.timeTextView);
        TextView summaryTextView = (TextView) view.findViewById(R.id.summaryTextView);
        TextView tempTextView = (TextView) view.findViewById(R.id.tempTextView);

        timeTextView.setText(getDate(hourlyDataModel.time));
        summaryTextView.setText(hourlyDataModel.summary);
        tempTextView.setText(String.valueOf(hourlyDataModel.temperature));

        return view;
    }

    private String getDate(long date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        return simpleDateFormat.format(date);
    }
}



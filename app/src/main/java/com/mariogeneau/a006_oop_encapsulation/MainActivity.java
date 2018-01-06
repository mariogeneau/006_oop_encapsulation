//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
package com.mariogeneau.a006_oop_encapsulation;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
public class MainActivity extends AppCompatActivity {
    //------
    TemperatureConverter temperatureConverter;
    DistanceConverter distanceConverter;
    EditText unit_to_convert_field;
    TextView result_label;
    //------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---
        temperatureConverter = new TemperatureConverter("0.0");
        distanceConverter = new DistanceConverter("0.0");
        //---
        unit_to_convert_field = findViewById(R.id.unit_to_convert_field);
        result_label = findViewById(R.id.result_label);
    }
    //------
    public void convertFarToCell(View v) {
        String s = String.valueOf(unit_to_convert_field.getText());
        double d = Double.parseDouble(s);
        double c = temperatureConverter.convertFarToCell(d);
        s = String.valueOf(c);
        result_label.setText(s);
    }
    //------
    public void convertCellToFar(View v) {
        String s = String.valueOf(unit_to_convert_field.getText());
        double d = Double.parseDouble(s);
        double f = temperatureConverter.convertCellToFar(d);
        s = String.valueOf(f);
        result_label.setText(s);
    }
    //------
    public void convertMilesToKm(View v) {
        String s = String.valueOf(unit_to_convert_field.getText());
        double d = Double.parseDouble(s);
        double c = distanceConverter.convertMilesToKm(d);
        s = String.valueOf(c);
        result_label.setText(s);
    }
    //------
    public void convertKmToMiles(View v) {
        String s = String.valueOf(unit_to_convert_field.getText());
        double d = Double.parseDouble(s);
        double c = distanceConverter.convertKmToMiles(d);
        s = String.valueOf(c);
        result_label.setText(s);
    }
    //------
}
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬













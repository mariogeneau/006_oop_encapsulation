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
    UnitConverter unitConverter;
    EditText temperature_field;
    TextView result_label;
    //------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---
        unitConverter = new UnitConverter("0.0");
        //---
        temperature_field = findViewById(R.id.temperature_field);
        result_label = findViewById(R.id.result_label);
    }
    //------
    public void convertFarToCell(View v) {
        String s = String.valueOf(temperature_field.getText());
        double d = Double.parseDouble(s);
        double c = unitConverter.convertFarToCell(d);
        s = String.valueOf(c);
        result_label.setText(s);
    }
    //------
    public void convertCellToFar(View v) {
        String s = String.valueOf(temperature_field.getText());
        double d = Double.parseDouble(s);
        double f = unitConverter.convertCellToFar(d);
        s = String.valueOf(f);
        result_label.setText(s);
    }
    //------
}
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬













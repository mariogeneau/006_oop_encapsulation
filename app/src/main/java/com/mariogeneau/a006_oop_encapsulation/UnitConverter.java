//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
package com.mariogeneau.a006_oop_encapsulation;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
import java.text.DecimalFormat;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
public class UnitConverter {
    //------
    DecimalFormat precision;
    //------
    public UnitConverter(String precision) {
        this.precision = new DecimalFormat(precision);
    }
    //------
    public double convertFarToCell(double fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        String p = precision.format(c);
        double d = Double.parseDouble(p);
        return d;
    }
    //------
    public double convertCellToFar(double celsius) {
        double f = celsius * 9 / 5 + 32;
        String p = precision.format(f);
        double d = Double.parseDouble(p);
        return d;
    }
    //------
}
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
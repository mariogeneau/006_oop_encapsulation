//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
package com.mariogeneau.a006_oop_encapsulation;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
public class TemperatureConverter extends UnitConverter {
    //------
    public TemperatureConverter(String precision) {
        super(precision);
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

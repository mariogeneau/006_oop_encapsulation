//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
package com.mariogeneau.a006_oop_encapsulation;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
public class DistanceConverter extends UnitConverter {
    //------
    public DistanceConverter(String precision) {
        super(precision);
    }
    //------
    public double convertKmToMiles(double kilometers) {
        double m = kilometers / 1.609344;
        String p = precision.format(m);
        double d = Double.parseDouble(p);
        return d;
    }
    //------
    public double convertMilesToKm(double miles) {
        double k = miles * 1.609344;
        String p = precision.format(k);
        double d = Double.parseDouble(p);
        return d;
    }
    //------
}
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
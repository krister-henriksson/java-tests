/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

/**
 *
 * @author koehenri
 */
public enum ConversionFactors {

    FOOT_TO_M(0.3048),
    INCH_TO_CM(2.54),
    IMP_MILE_TO_KM(1.609344),
    OUNCE_TO_G(28.349523125),
    FLOUNCE_TO_CL(2.95735295625),
    IMP_POUND_TO_KG(0.45359237),
    YARD_TO_M(0.9144)
    ;

    private double val;

    private ConversionFactors(double in) {
        val = in;
    }

    public double getValue() {
        return val;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Oleg
 */
public class IntegralCalculator {
    public static double integrateTan(double a, double b, double h) {
        double sum = 0.0;
        for (double x = a; x < b; x += h) {
            double xNext = x + h < b? (x + h) : b;
            double f1 = Math.tan(x);
            double f2 = Math.tan(xNext);
            sum += (f1 + f2) / 2 * (xNext - x);
        }
        return sum;
    }
}

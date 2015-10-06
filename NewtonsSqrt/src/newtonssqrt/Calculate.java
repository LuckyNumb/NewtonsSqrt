/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonssqrt;

import static java.lang.Math.abs;

/**
 *
 * @author Mike
 */
public class Calculate {

    public void Sqrt(double x, double est) {
        double result = 0;
        result = ((x / est) + est) / 2;
        result = (double) Math.round(result * 10000) / 10000;
        System.out.println(est + " " + result);
        if (!((abs(est * est - x) / x) < 0.001)) {
            Sqrt(x, result);
        }
    }
}

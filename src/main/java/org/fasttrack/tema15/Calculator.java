package org.fasttrack.tema15;

public class Calculator {

    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double temperature) {
        return temperature * 9 / 5 + 32;
    }
}

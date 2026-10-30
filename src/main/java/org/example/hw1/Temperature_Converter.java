package org.example.hw1;

import java.math.BigDecimal;

public class Temperature_Converter {
    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (temperatureConverter(0).compareTo(new BigDecimal(32.0))));
        System.out.println("Expected true.Result:" + (temperatureConverter(100).compareTo(new BigDecimal(212.0))));
        System.out.println("Expected true.Result:" + (temperatureConverter(-40).compareTo(new BigDecimal(-40.0))));
        System.out.println("Expected true.Result:" + (temperatureConverter(37).compareTo(new BigDecimal(98.6))));
        System.out.println("Expected true.Result:" + (temperatureConverter(36.6).compareTo(new BigDecimal(97.88))));
        System.out.println("Expected true.Result:" + (temperatureConverter(-273.15).compareTo(new BigDecimal(-459.67))));
        System.out.println("Expected true.Result:" + (temperatureConverter(-274).compareTo(new BigDecimal(32.0))));
    }
    public static BigDecimal temperatureConverter(double temperature){
        return new BigDecimal(temperature* 1.8+ 32);
    }
}
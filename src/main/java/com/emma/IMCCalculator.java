package com.emma;

public class IMCCalculator {

    private double weight;
    private double height;

    public IMCCalculator(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Peso y estatura deben ser mayores a cero");
        }
        this.weight = weight;
        this.height = height;
    }

    public double calculateIMC() {
        return Math.round(weight / (Math.pow(height, 2)) * 100) / 100.0;
    }


}

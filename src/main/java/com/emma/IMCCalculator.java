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

    public String getIMCClassification() {
        double imc = calculateIMC();

        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if(imc >= 35 && imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}

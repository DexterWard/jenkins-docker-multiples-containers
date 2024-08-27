package com.apasoft;

//import java.util.Scanner;

public class App {
    private static final double MILES_TO_KILOMETERS_CONVERSION = 1.60934;

    public static void main(String[] args) {
       //Scanner scanner = new Scanner(System.in);

        // Solicitar la distancia en millas
        //System.out.print("Ingrese la distancia en millas: ");
        //double miles = scanner.nextDouble();
        double miles = Double.parseDouble(args[0]);

        // Convertir millas a kilómetros
        double kilometers = convertMilesToKilometers(miles);

        // Imprimir el resultado
        System.out.println(miles + " miles are equivalent to " + kilometers + " kilimeters.");
        
        //scanner.close();
    }

    // Method for converting miles to kilometers
    public static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS_CONVERSION;
    }
}

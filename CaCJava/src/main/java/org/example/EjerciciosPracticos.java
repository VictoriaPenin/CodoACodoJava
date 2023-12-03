package org.example;

import java.util.Scanner;

public class EjerciciosPracticos {

    // Ejercicio 1
    public static void imprimirMensaje(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Bienvenidos al curso Full Stack");
        }
    }

    // Ejercicio 2
    public static int calcularMaximo(int a, int b) {
        return Math.max(a, b);
    }

    // Ejercicio 3
    public static double promedio3(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Ejercicio 4
    public static double calcularPromedioNotas() {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int cantidad = 0;
        double nota;

        System.out.println("Ingrese las notas (ingrese -1 para finalizar):");
        do {
            nota = scanner.nextDouble();
            if (nota != -1) {
                suma += nota;
                cantidad++;
            }
        } while (nota != -1);

        if (cantidad > 0) {
            return suma / cantidad;
        } else {
            return 0;
        }
    }

    // Ejercicio 5
    public static double doble(double valor) {
        return valor * 2;
    }

    // Ejercicio 6
    public static double cuadrado(double valor) {
        return Math.pow(valor, 2);
    }

    // Ejercicio 7
    public static void imprimirValores(double numero) {
        System.out.println("Siguiente valor: " + (numero + 1));
        System.out.println("Doble: " + doble(numero));
        System.out.println("Cuadrado: " + cuadrado(numero));
    }

    // Ejercicio 8
    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    // Ejercicio 9
    public static double calcularSuperficieCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    // Ejercicio 10
    public static double calcularCircunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // Ejercicio 11
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Ejercicio 12
    public static int obtenerDiasDelMes(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0; // Valor inválido para el mes
        }
    }


}

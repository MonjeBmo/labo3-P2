import figure.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("1-Triangulo\n2-Cuadrado\n3-Rectangulo\n4-Circulo\n0-salir\n\tOpcion:");
            x = s.nextInt();
            switch (x) {
                case 1 -> triangulo(s);
                case 2 -> cuadrado(s);
                case 3 -> rectangulo(s);
                case 4 -> circulo(s);

                case 0 -> System.out.println("Adios Feliz Dia!");
                default -> System.out.println("opcion no valida");
            }
        } while (x != 0);
        s.close();
    }

    public static void triangulo(Scanner s) {
        // Solicita y lee la base del Triángulo
        System.out.println("Ingrese la base del Triangulo : ");
        var base = s.nextDouble();
        // Solicita y lee la altura del Triángulo
        System.out.println("Ingrese la Altura del Triangulo : ");
        var h = s.nextDouble();
        // Solicita y lee el largo de los lados del Triángulo
        System.out.println("Ingrese el largo de los lados del Triangulo : ");
        var lado = s.nextDouble();
        // Crea un objeto Triangulo con los valores proporcionados
        Triangulo tri = new Triangulo(base, h, lado);
        // Muestra información sobre el triángulo
        System.out.println("Datos");
        System.out.println("\tBase : " + tri.getBase() + "Altura : " + tri.getH() + "Lado : " + tri.getLado());
        System.out.println("El area del triangulo : " + tri.calcularArea());
        System.out.println("El perimetro del Triangulo : " + tri.calcularPerimetro());
    }

    public static void cuadrado(Scanner s) {
        // Solicita y lee el valor de un lado del Cuadrado
        System.out.println("Ingrese lo que mide un lado : ");
        var lado = s.nextDouble();
        // Crea un objeto Cuadrado con el valor proporcionado
        Cuadrado cuadrado = new Cuadrado(lado);
        // Muestra información sobre el cuadrado
        System.out.println("Datos");
        System.out.println("\tLado : " + cuadrado.getLado());
        System.out.println("EL perimetro es de : " + cuadrado.calcularPerimetro());
        System.out.println("El Area es de : " + cuadrado.calcularArea());
    }

    public static void rectangulo(Scanner s) {
        // Solicita y lee la base del Rectángulo
        System.out.println("Ingrese la base: ");
        var base = s.nextDouble();
        // Solicita y lee la altura del Rectángulo
        System.out.println("Ingrese la Altura: ");
        var altura = s.nextDouble();
        // Crea un objeto Rectangulo con los valores proporcionados
        Rectangulo rectangulo = new Rectangulo(base, altura);
        // Muestra información sobre el rectángulo
        System.out.println("Datos");
        System.out.println("\tBase : " + rectangulo.getBase() + "Altura : " + rectangulo.getAltura());
        System.out.println("EL perimetro es de : " + rectangulo.calcularPerimetro());
        System.out.println("El Area es de : " + rectangulo.calcularArea());
    }

    public static void circulo(Scanner s) {
        // Solicita y lee el radio del Círculo
        System.out.println("Ingrese el Radios: ");
        var radio = s.nextDouble();
        // Crea un objeto Circulo con el valor proporcionado
        Circulo circulo = new Circulo(radio);
        // Muestra información sobre el círculo
        System.out.println("Datos");
        System.out.println("\tRadio : " + circulo.getRadio());
        System.out.println("EL perimetro es de : " + circulo.calcularPerimetro());
        System.out.println("El Area es de : " + circulo.calcularArea());
    }

}
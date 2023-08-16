package figure;

// Definición de la clase Triangulo que hereda de la clase abstracta Figura
public class Triangulo extends Figura {
    // Atributos privados para almacenar la base, altura y longitud de un lado del triángulo
    private double base;
    private double h;
    private double lado;

    // Constructor que recibe la base, altura y longitud de un lado del triángulo como parámetros
    public Triangulo(double base, double h, double lado) {
        this.base = base;
        this.h = h;
        this.lado = lado;
    }

    // Implementación del método para calcular el área del triángulo
    @Override
    public double calcularArea() {
        return (this.base * this.h) / 2;
    }

    // Implementación del método para calcular el perímetro del triángulo
    @Override
    public double calcularPerimetro() {
        return 3 * this.lado;
    }

    // Métodos getter y setter para obtener y establecer los valores de los atributos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

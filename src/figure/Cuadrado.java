package figure;

// Definición de la clase Cuadrado que hereda de la clase abstracta Figura
public class Cuadrado extends Figura {
    // Atributo privado para almacenar la longitud de un lado del cuadrado
    private double lado;

    // Constructor que recibe la longitud de un lado del cuadrado como parámetro
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método para calcular el área del cuadrado
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    // Implementación del método para calcular el perímetro del cuadrado
    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    // Método getter para obtener el valor de la longitud del lado
    public double getLado() {
        return lado;
    }

    // Método setter para establecer el valor de la longitud del lado
    public void setLado(double lado) {
        this.lado = lado;
    }
}

package figure;

// Definición de la clase Rectangulo que hereda de la clase abstracta Figura
public class Rectangulo extends Figura {
    // Atributos privados para almacenar la base y la altura del rectángulo
    private double base;
    private double altura;

    // Constructor que recibe la base y la altura del rectángulo como parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método para calcular el área del rectángulo
    @Override
    public double calcularArea() {
        return this.altura * this.base;
    }

    // Implementación del método para calcular el perímetro del rectángulo
    @Override
    public double calcularPerimetro() {
        return 2 * (this.altura + this.base);
    }

    // Método getter para obtener el valor de la base
    public double getBase() {
        return base;
    }

    // Método setter para establecer el valor de la base
    public void setBase(double base) {
        this.base = base;
    }

    // Método getter para obtener el valor de la altura
    public double getAltura() {
        return altura;
    }

    // Método setter para establecer el valor de la altura
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

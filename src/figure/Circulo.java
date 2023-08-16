package figure;

public class Circulo extends Figura {
    // Atributo privado para almacenar el radio del círculo
    private double radio;

    // Constructor que recibe el radio del círculo como parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área del círculo
    @Override
    public double calcularArea() {
        return 3.14 * (this.radio * this.radio);
    }

    // Implementación del método para calcular el perímetro del círculo
    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * this.radio;
    }

    // Método getter para obtener el valor del radio
    public double getRadio() {
        return radio;
    }

    // Método setter para establecer el valor del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

package figure;

public abstract class Figura {
//   Metodos abtractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
//    Metodo concretos
    public void mostrarDescripcion(){
        System.out.println("Esta es un a figura geometrica: ");
    }

}

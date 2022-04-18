package Ejercicio3;

public class Rectangulo extends Figura{
    private double largo;
    private double alto;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.alto = ancho;
    }

    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.alto = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double calcularPerimetro() {
        return (2*(largo+alto));
    }

    @Override
    public double calcularArea() {
        return largo*alto;
    }
}

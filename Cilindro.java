package Ejercicio1;

public class Cilindro extends Circulo{
    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double volumen(){
        return super.area()*altura;
    }

   @Override
    public double area() {
       return ((2 * Math.PI * radio * altura) + (2 * super.area()));
   }

    @Override
    public String toString() {
        return super.toString() +
                "\nAltura: "+ altura +
                "\nVolumen: "+ this.volumen();
    }
}

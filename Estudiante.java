package Ejercicio2;

public class Estudiante extends Persona{
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String nombre, String apellido, int dni, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(nombre, apellido, dni, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }
}

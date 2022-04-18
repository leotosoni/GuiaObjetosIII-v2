package Ejercicio2;

public class MiembroStaff extends Persona{
    private double salario;
    private String turno; //manana o noche

    public MiembroStaff(String nombre, String apellido, int dni, String direccion, double salario, String turno) {
        super(nombre, apellido, dni, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public double salarioAnual(){
        return 12*this.salario;
    }
}

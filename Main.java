import Ejercicio1.Cilindro;
import Ejercicio2.Estudiante;
import Ejercicio2.MiembroStaff;
import Ejercicio2.Persona;
import Ejercicio3.*;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        ejercicio1();
       // ejercicio2();
        // ejercicio3();

    }

    public static void ejercicio1() {
        System.out.println("\n--- EJERCICIO 1 ---");

        Cilindro cil = new Cilindro();

        System.out.println("cil.volumen() = " + cil.volumen());
        System.out.println(cil.toString());

        Cilindro cil2 = new Cilindro(5.0, "red", 2.0);
        System.out.println(cil2.toString());

        MyFrame frame = new MyFrame(txtToHtml(cil2.toString()));
    }

    public static void ejercicio2() {
        System.out.println("\n--- EJERCICIO 2 ---");

        Estudiante Jorge = new Estudiante("Jorge", "Lopez",
                33646050, "MDP", 2018, 1800, "Quimica");
        Estudiante Maria = new Estudiante("Maria", "Garcia",
                52980984, "MDP", 2018, 200, "Fisica");
        Estudiante Martin = new Estudiante("Martin", "Malgor", 34980342,
                "MDP", 202, 2100, "Biologia");

        MiembroStaff Pedro = new MiembroStaff("Pedro", "Mario",
                22390938, "MDP", 20000, "manana");
        MiembroStaff Jose = new MiembroStaff("Jose", "Peluso",
                20398876, "MDP", 30200, "noche");
        MiembroStaff Sofia = new MiembroStaff("Sofia", "Gonzalez",
                30287289, "MDP", 43000, "noche");
        MiembroStaff Carla = new MiembroStaff("Carla", "Conte",
                28891113, "MDP", 59000, "manana");

        Persona[] arreglo = new Persona[7];
        arreglo[0] = Jorge;
        arreglo[1] = Maria;
        arreglo[2] = Martin;
        arreglo[3] = Pedro;
        arreglo[4] = Jose;
        arreglo[5] = Sofia;
        arreglo[6] = Carla;

        int cantidadEstudiantes = 0;
        int cantidadMiembros = 0;
        for (Persona persona : arreglo) {
            if (persona instanceof Estudiante) {
                cantidadEstudiantes++;
            }
            if (persona instanceof MiembroStaff) {
                cantidadMiembros++;
            }
        }

        System.out.println("Cantidad de Estudiantes: " + cantidadEstudiantes);
        System.out.println("Cantidad de Miembros de Staff: " + cantidadMiembros);

        double sumaCuotasEstudiantes = 0.0;
        for(Persona persona: arreglo){
            if(persona instanceof Estudiante){
                sumaCuotasEstudiantes += ((Estudiante)persona).getCuotaMensual();
            }
        }
        System.out.println("Total Ingresos de las Cuotas de Estudiantes: "+ sumaCuotasEstudiantes);
    }

    public static void ejercicio3(){

        System.out.println("\n--- EJERCICIO 3 ---");

        Circulo circulo = new Circulo("rojo", 10.0);

        System.out.println("circulo.calcularArea() = " + circulo.calcularArea());
        System.out.println("circulo.calcularPerimetro() = " + circulo.calcularPerimetro());
        
        Rectangulo rectangulo = new Rectangulo(10.0, 15.0);

        System.out.println("rectangulo.calcularPerimetro() = " + rectangulo.calcularPerimetro());
        System.out.println("rectangulo.calcularArea() = " + rectangulo.calcularArea());
        
        Cuadrado cuadrado = new Cuadrado(7.0);

        System.out.println("cuadrado.calcularPerimetro() = " + cuadrado.calcularPerimetro());
        System.out.println("cuadrado.calcularArea() = " + cuadrado.calcularArea());
        
    }

    public static String txtToHtml(String s) {
        StringBuilder builder = new StringBuilder("<html>");
        boolean previousWasASpace = false;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (previousWasASpace) {
                    builder.append("&nbsp;");
                    previousWasASpace = false;
                    continue;
                }
                previousWasASpace = true;
            } else {
                previousWasASpace = false;
            }
            switch (c) {
                case '<':
                    builder.append("&lt;");
                    break;
                case '>':
                    builder.append("&gt;");
                    break;
                case '&':
                    builder.append("&amp;");
                    break;
                case '"':
                    builder.append("&quot;");
                    break;
                case '\n':
                    builder.append("<br>");
                    break;
                // We need Tab support here, because we print StackTraces as HTML
                case '\t':
                    builder.append("&nbsp; &nbsp; &nbsp;");
                    break;
                default:
                    builder.append(c);

            }
        }
        builder.append("</html>");
        String converted = builder.toString();
        String str = "(?i)\\b((?:https?://|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:\'\".,<>?«»“”‘’]))";
        Pattern patt = Pattern.compile(str);
        Matcher matcher = patt.matcher(converted);
        converted = matcher.replaceAll("<a href=\"$1\">$1</a>");
        return converted;
    }
}

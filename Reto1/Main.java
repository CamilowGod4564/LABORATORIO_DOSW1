package Reto1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Isaac David Palomo Peralta", 6, 20, "isaac.palomo-p@mail.escuelaing.edu.co"));
        estudiantes.add(new Estudiante("Juan Camilo Cristancho Velasquez", 6, 19, "juan.cristancho-v@mail.escuelaing.edu.co"));

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}

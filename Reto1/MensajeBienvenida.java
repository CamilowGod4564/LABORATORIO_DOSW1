package Reto1;
import java.util.List;
import java.util.stream.Collectors;


public class MensajeBienvenida {

    public static String generarMensaje(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .map(e -> e.getNombre() + " estudiante de la escuela de " + e.getSemestre() +
                          " semestre de " + e.getEdad() + " años, correo: " + e.getCorreo())
                .collect(Collectors.joining(" y ", 
                        "¡Hola Bienvenidos! Nosotros somos la pareja conformada por ", 
                        "."));
    }
}

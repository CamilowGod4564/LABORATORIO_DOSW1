package Reto1;

public class Estudiante {
    private String nombre;
    private int semestre;
    private int edad;
    private String correo;

    public Estudiante(String nombre, int semestre, int edad, String correo) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }
}

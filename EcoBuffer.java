package Reto3;

public class EcoBuffer {
    public static String eco(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
    
}

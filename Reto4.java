import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Reto4 {
    public static Hashtable<String, Integer> crearTabla(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        for (Map.Entry<String, Integer> par : lista) {
            // Solo agregar si la clave aún no existe
            if (!tabla.containsKey(par.getKey())) {
                tabla.put(par.getKey(), par.getValue());
            }
        }
        return tabla;
    }
}

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Reto4 {
    public static Hashtable<String, Integer> crearTabla(List<Map.Entry<String, Integer>> lista) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        for (Map.Entry<String, Integer> par : lista) {
            if (!tabla.containsKey(par.getKey())) {
                tabla.put(par.getKey(), par.getValue());
            }
        }
        return tabla;
    }

    public static HashMap<String, Integer> combinarMapas(HashMap<String, Integer> mapa, Hashtable<String, Integer> tabla) {
        HashMap<String, Integer> combinado = new HashMap<>();

        // Usamos un stream combinado de ambas colecciones
        Stream.concat(mapa.entrySet().stream(), tabla.entrySet().stream())
              .forEach(par -> combinado.putIfAbsent(par.getKey(), par.getValue()));

        return combinado;
    }

    public static void imprimirOrdenado(HashMap<String, Integer> mapa) {
        // Pasamos el HashMap a un TreeMap que ordena las claves automáticamente
        TreeMap<String, Integer> ordenado = new TreeMap<>(mapa);

        for (Map.Entry<String, Integer> par : ordenado.entrySet()) {
            System.out.println(par.getKey() + " -> " + par.getValue());
        }
    }
}

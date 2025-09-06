package Reto3;
import java.util.stream.Collectors;
import java .util.stream.IntStream;

public class EcoBuilder {
    public static String eco(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

         StringBuilder sb = new StringBuilder(repetido);
         return sb.toString();       
    }
    
}

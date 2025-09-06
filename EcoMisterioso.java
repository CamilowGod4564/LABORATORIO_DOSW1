package Reto3;
import java.util.stream.Collectors;
import java .util.stream.IntStream;

public class EcoMisterioso {
    public static String eco(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));
        StringBuffer sb = new StringBuffer(repetido);
        return sb.reverse().toString();

    }

    
    public static void main(String[] args) {
        java.util.function.Function<String, String> funcionEco = EcoMisterioso::eco;
        String resultado = funcionEco.apply("Hola Cueva");
        System.out.println(resultado);

    }
       
}

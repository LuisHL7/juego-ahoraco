package ui;

/**
 * Clase que se encarga de generar la palabra a adivinar
 * Simplemente mantiene una lista de palabras de un array y escoge una aleatoriamente.
 * @author Luis Huapaya
 */
public class GeneradorArrayPalabras implements GeneradorPalabra {
    /**
     * Array con la lista de palabras a adivinar
     */
    private static final String[] LISTA_PALABRAS = {"analista", "alumno", "lunas", "amigo"};

    /**
     * Método que genera una palabra a adivinar
     * @return Palabra a adivinar
     * @throws GenerarPalabraException En caso de error arroja esta exception.
     */
    @Override
    public String generarPalabra() throws GenerarPalabraException {
        int posPalabra = new java.util.Random().nextInt(LISTA_PALABRAS.length);
        return LISTA_PALABRAS[posPalabra];
    }
}

package ui;

/**
 * Interfaz para las clases que generan las palabras del ahorcado
 *
 * @author Luis Huapaya
 */
public interface GeneradorPalabra {
    /**
     * Método que genera la palabra a adivinar
     *
     * @return Palabra a adivinar
     * @throws GenerarPalabraException Deberá arrojarse esta excepción si la palabra no pudo ser generada
     */
    public String generarPalabra() throws GenerarPalabraException;
}


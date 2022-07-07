package model;

import java.util.ArrayList;

/**
 * Clase que implementa una partida del Ahorcado.
 *
 * @author Luis Huapaya
 */
public class Ahorcado {
    /**
     * Número máximo de errores permitidos antes de dar la partida por perdida.
     */
    public static final int MAX_ERRORES = 6;

    /**
     * Palabra oculta a adivinar en la partida
     */
    private PalabraOculta palabraOculta;

    /**
     * Array con los caracteres fallados en la partida
     */
    private final ArrayList<Character> ERRORES = new ArrayList<>();

    /**
     * Crea una nueva partida, indicando la palabra a adivinar.
     * @param palabra Palabra a adivinar.
     */
    public Ahorcado(String palabra) {
        this.palabraOculta = new PalabraOculta(palabra);
    }

    /**
     * Obtén la lista de caracteres fallados en la partida.
     *
     * @return Lista de caracteres fallados.
     */
    public ArrayList<Character> getERRORES() {
        return ERRORES;
    }

    /**
     * Obtén la lista de caracteres fallados en la partida en formato String.
     *
     * @return String de caracteres fallados.
     */
    public String getStringErrores() {
        String resultado = "";

        for (char c : ERRORES) {
            resultado += c + " ";
        }
        return resultado.trim();
    }

    /**
     * Devuelve la palabra oculta pero poniendo un guion en las letras no acertadas
     *
     * @return Mostrar la palabra oculta con las letras acertadas.
     */
    public String mostrarPalabraOculta() {
        return palabraOculta.mostrar();
    }

    /**
     * Devuelve la palabra oculta mostrando todas sus letras
     *
     * @return Palabra oculta completa
     */
    public String mostrarPalabraCompleta() {
        return palabraOculta.mostrarPalabraCompleta();
    }

    /**
     * Comprueba si el caracter indicado forma parte de la palabra oculta. Si
     * está, se mostrará todas sus apariciones como letras acertadas; si no está
     * añadir el carácter a la lista de fallos de la partida
     *
     * @param c Caracter que se quiere comprobar que está em la palabra
     */
    public void comprobarCaracter(char c) {
        if (!palabraOculta.comprobarCaracter(c)) {
            ERRORES.add(c);
        }
    }

    /**
     * Comprueba si finaliza la partida, bien porque se llegó al límite de fallos
     * o bien porque se adivinó toda la palabra oculta.
     *
     * @return true se finalizó la partida
     */
    public boolean finDelJuego() {
        return ((maxErroresSuperado()) || palabraOculta.esVisible());
    }

    /**
     * Comprueba si se llegó al límite de fallos permitidos
     *
     * @return true si se llegó al límite de fallos
     */
    public boolean maxErroresSuperado() {
        return (ERRORES.size() >= Ahorcado.MAX_ERRORES);
    }
}


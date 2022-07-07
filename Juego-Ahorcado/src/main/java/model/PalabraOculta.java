package model;

import java.util.Arrays;

/**
 * Clase que implemente la palabra oculta a adivinar en el juego del ahorcado
 * @author Luis Huapaya
 */
public class PalabraOculta {

    /**
     * Array de caracteres de la palabra oculta
     */
    private final char[] caracteres;

    /**
     * Array que indica los caracteres ya acertados
     */
    private final boolean[] aciertos;

    /**
     * Constructor de la clase, que recibe un string con la palabra a adivinar
     * @param palabra Palabra a adivinar.
     */
    public PalabraOculta(String palabra) {
        caracteres = palabra.toCharArray();  // Transformamos el String a un array de caracteres y lo almacenamos en el atributo
        // Inicializamos el array de aciertos con la longitud de la palabra e inicializamos los valores a "false".
        aciertos = new boolean[caracteres.length];
        Arrays.fill(aciertos, false); // Llena el array con todos los valores a "false"
    }

    /**
     * Comprueba si un caracter aparece en la lista de los caracteres de la palabra, marcando
     * todas las apariciones del caracter como acertadas.
     * @param c Caracter a comprobar.
     * @return true si el caracter aparece en la palabra, false en caso contrario.
     */
    public boolean comprobarCaracter(char c) {
        boolean correcto = false;

        for (int i = 0; i < caracteres.length; i++) {
            if (Character.toLowerCase(caracteres[i]) == Character.toLowerCase(c)) {
                correcto = true;
                aciertos[i] = true;
            }
        }
        return correcto;
    }

    /**
     * Devuelve la palabra sustituyendo los caracteres no acertados por guiones.
     * @return Palabra ocultando los caracteres no acertados.
     */
    public String mostrar() {
        StringBuilder resultado = new StringBuilder();

        for (int i=0; i<caracteres.length; i++) {
            if (aciertos[i])
                resultado.append(caracteres[i]);
            else
                resultado.append("-");
        }

        return resultado.toString();
    }

    /**
     * Devuelve la palabra completa, incluyendo los caracteres no acertados
     * @return Palabra completa
     */
    public String mostrarPalabraCompleta() {
        return new String(caracteres);
    }

    /**
     * Indica si la palabra es totalmente visible, es decir, si todos los caracteres
     * fueron acertados.
     * @return true si todos los caracteres fueron acertados, false en caso contrario
     */
    public boolean esVisible() {
        boolean visible = true;

        for (boolean acierto : aciertos) {
            if (!acierto) {
                visible = false;
                break;
            }
        }
        return visible;
    }
}
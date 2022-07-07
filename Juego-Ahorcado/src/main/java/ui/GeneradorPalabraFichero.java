package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Implementa un nuevo modo de juego leyendo las palabras de un fichero de texto.
 *
 * @author Luis Huapaya
 */
public class GeneradorPalabraFichero implements GeneradorPalabra {
    /**
     * @return devuelve una palabra aleatoria de un fichero de palabras.
     * @throws GenerarPalabraException si ocurre un error al intentar leer el fichero.
     */
    @Override
    public String generarPalabra() throws GenerarPalabraException {
        ArrayList<String> palabras = new ArrayList<>();

        File fichero = new File(Objects.requireNonNull(getClass().getClassLoader().getResource("FicheroPalabras.txt")).getFile());
        try (Scanner sc = new Scanner(fichero)) {
            while (sc.hasNextLine()) {
                palabras.add(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            throw new GenerarPalabraException("Error de acceso al fichero.", true);
        }

        int numAleatorio = (int) (Math.random() * palabras.size());

        return palabras.get(numAleatorio);
    }

}

package ui;

import javax.swing.*;

/**
 *Implementa la interfaz GeneradorPalabra y es la clase que se utiliza desde la clase VentanaPrincipal.
 * @author Luis Huapaya
 */
public class GeneradorPalabraTeclado implements GeneradorPalabra {

    /**
     * Genera un cuadro para introducir la palabra secreta.
     * @return palabra secreta.
     * @throws GenerarPalabraException si no introduce una palabra.
     */
    @Override
    public String generarPalabra() throws GenerarPalabraException {
        String palabra = null;
        JPasswordField jPasswordField = new JPasswordField();
        int opcion = JOptionPane.showConfirmDialog(null, jPasswordField,
                "Palabra secreta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            palabra = new String(jPasswordField.getPassword());
        } else {
            throw new GenerarPalabraException("Error, debe introducir una palabra secreta.", false);
        }


        return palabra;
    }
}

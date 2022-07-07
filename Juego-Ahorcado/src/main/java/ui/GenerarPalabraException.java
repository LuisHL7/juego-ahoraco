package ui;

/**
 * Clase que implementa una excepción que puede ocurrir cuando se genera una palabra oculta
 * @author Luis Huapaya
 */
public class GenerarPalabraException extends Exception {
    /**
     * Indica si se debe mostrar un mensaje de excepción al usuario
     */
    private boolean visible;

    /**
     * Crea una nueva excepción en la creación de una palabra oculta
     * @param mensaje Mensaje que explica el error ocurrido
     * @param visible Indica si se debe mostrar el mensaje de error al usuario
     */
    public GenerarPalabraException(String mensaje, boolean visible) {
        super(mensaje);
        this.visible = visible;
    }

    /**
     * Obtén se se debe mostrar a mensaxe da excepción ao usuario
     * @return true se se debe mostrar a mensaxe da excepción ao usuario
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Establece se se debe mostrar a mensaxe da excepción ao usuario
     * @param visible true se se debe mostrar a mensaxe da excepción ao usuario
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}

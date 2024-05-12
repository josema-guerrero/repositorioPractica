package Model;

import java.util.*;

/**
 * Clase para gestionar suscripciones dentro de la aplicación.
 * Permite cambiar la contraseña de tu usuario.
 * 
 * @author Jose Maria y Juan Francisco
 * @version 1.0
 */


public class Suscripcion {

    private boolean unAño;
    private boolean familiar;

    public Suscripcion() {
        // Constructor por defecto
    }

    public void pagado() {
        // Método para indicar que la suscripción ha sido pagada
    }
    
    /**
     * Añade una noticia a la lista correspondiente según el tipo.
     * 
     * @param nuevaContraseña la contraseña nueva que deseamos poner
     * @throws IllegalArgumentException si la contraseña es incorrecta.
     */

    public void cambiarContraseña(String nuevaContraseña) {
        // Verificar si la nueva contraseña es válida
        if (nuevaContraseña != null && !nuevaContraseña.isEmpty()) {
            System.out.println("La contraseña ha sido cambiada exitosamente.");
        } else {
            System.out.println("La nueva contraseña no es válida.");
        }
    }

    // Getters y setters para los campos
    public boolean isUnAño() {
        return unAño;
    }

    public void setUnAño(boolean unAño) {
        this.unAño = unAño;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    void setContraseña(String contraseña123) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getContraseña() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

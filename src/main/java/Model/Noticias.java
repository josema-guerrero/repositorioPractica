package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para gestionar noticias dentro de la aplicación.
 * Permite añadir noticias y categorizarlas como nuevas, antiguas o destacadas.
 * 
 * @author Jose Maria y Juan Francisco
 * @version 1.0
 */
public class Noticias {

    private List<String> nuevas;
    private List<String> antiguas;
    private List<String> destacadas;

    /**
     * Constructor para inicializar las listas de noticias.
     */
    public Noticias() {
        nuevas = new ArrayList<>();
        antiguas = new ArrayList<>();
        destacadas = new ArrayList<>();
    }

    /**
     * Añade una noticia a la lista correspondiente según el tipo.
     * 
     * @param noticia el contenido de la noticia a añadir.
     * @param tipo el tipo de la noticia (nueva, antigua, destacada).
     * @throws IllegalArgumentException si el tipo de noticia no es válido.
     */
    public void añadirNoticia(String noticia, String tipo) {
        switch (tipo) {
            case "nueva":
                nuevas.add(noticia);
                break;
            case "antigua":
                antiguas.add(noticia);
                break;
            case "destacada":
                destacadas.add(noticia);
                break;
            default:
                throw new IllegalArgumentException("Tipo de noticia no válido");
        }
    }
}


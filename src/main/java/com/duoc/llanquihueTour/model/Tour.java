package com.duoc.llanquihueTour.model;

/**
 * Representa un Tour dentro del sistema turístico.
 * <p>
 * Esta clase almacena la información básica de cada tour disponible,
 * incluyendo su nombre, locación geográfica, tipo de actividad y costo.
 * </p>
 */
public class Tour {
    // Atributos
    private String nombre;
    private String locacion;
    private String tipo;
    private int precio;

    /**
     * Constructor completo para inicializar todos los atributos de un Tour.
     *
     * @param nombre El nombre identificativo del tour.
     * @param lugar  La ubicación o destino geográfico donde se realiza.
     * @param tipo   La categoría del tour (ej. "Gastronómico", "Aventura").
     * @param precio El costo monetario asignado al tour.
     */
    public Tour(String nombre, String lugar, String tipo, int precio) {
        this.nombre = nombre;
        this.locacion = lugar;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y Setters

    /**
     * Obtiene el nombre del tour.
     *
     * @return El nombre actual del tour.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del tour.
     *
     * @param nombre El nuevo nombre para el tour.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la locación o lugar del tour.
     *
     * @return La locación actual.
     */
    public String getLocacion() {
        return locacion;
    }

    /**
     * Establece o modifica la locación del tour.
     *
     * @param locacion La nueva locación o destino.
     */
    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    /**
     * Obtiene el tipo o categoría del tour.
     *
     * @return El tipo de tour.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece o modifica el tipo de tour.
     *
     * @param tipo El nuevo tipo o categoría.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return El precio en valor entero.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece o modifica el precio del tour.
     *
     * @param precio El nuevo precio del tour.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve una representación en texto del objeto Tour con un formato tabulado.
     *
     * @return Una cadena de texto formateada con los datos del tour.
     */
    @Override
    public String toString() {
        // %-45s -> Reserva 45 espacios para el Nombre
        // %-25s -> Reserva 25 espacios para la Locación
        // %-10d -> Reserva 10 espacios para el número del Precio
        return String.format("Nombre = %-37s | Locación = %-20s  | Tipo = %-20s | Precio = $ %d",
                nombre, locacion,tipo, precio);
    }
}
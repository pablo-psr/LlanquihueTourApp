package com.duoc.llanquihueTour.model;

/**
 * Representa un centro de cultivo asociado en el sistema Llanquihue Tour.
 * <p>
 * Esta clase permite registrar y gestionar la información de los centros
 * acuícolas o agrícolas que forman parte de los puntos de interés de los tours.
 * </p>
 */
public class CentroCultivo {
    // Atributos requeridos (Paso 3)
    private String idCentro;
    private String nombre;
    private String ubicacion;

    /**
     * Constructor vacío por defecto.
     * Permite crear una instancia de CentroCultivo sin inicializar sus atributos de forma inmediata.
     */
    public CentroCultivo() {
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos del centro de cultivo.
     *
     * @param idCentro  El identificador único del centro de cultivo.
     * @param nombre    El nombre del centro de cultivo.
     * @param ubicacion La localización geográfica o cuerpo de agua donde se sitúa.
     */
    public CentroCultivo(String idCentro, String nombre, String ubicacion) {
        this.idCentro = idCentro;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters (Paso 3)

    /**
     * Obtiene el identificador único del centro de cultivo.
     *
     * @return El ID del centro.
     */
    public String getIdCentro() {
        return idCentro;
    }

    /**
     * Establece o modifica el identificador del centro de cultivo.
     *
     * @param idCentro El nuevo ID para el centro.
     */
    public void setIdCentro(String idCentro) {
        this.idCentro = idCentro;
    }

    /**
     * Obtiene el nombre del centro de cultivo.
     *
     * @return El nombre del centro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del centro de cultivo.
     *
     * @param nombre El nuevo nombre para el centro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la ubicación geográfica del centro de cultivo.
     *
     * @return La ubicación del centro.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece o modifica la ubicación geográfica del centro de cultivo.
     *
     * @param ubicacion La nueva ubicación para el centro.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método toString() para visualizar los datos (Paso 3)

    /**
     * Devuelve una representación en texto del objeto CentroCultivo con un formato estructurado.
     *
     * @return Una cadena de texto formateada con el ID, nombre y ubicación del centro.
     */
    @Override
    public String toString() {
        return String.format("ID = %-37s | Nombre = %-20s  | Ubicación = %-20s ",
                idCentro,nombre,ubicacion);

    }
}
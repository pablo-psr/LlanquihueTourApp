package com.duoc.llanquihueTour.model;

/**
 * Representa un producto del catálogo en el sistema Llanquihue Tour.
 * <p>
 * Esta clase se utiliza para gestionar el inventario de artículos relacionados
 * con los tours, permitiendo controlar su identificación, descripción y disponibilidad.
 * </p>
 */
public class Producto {
    // Atributos requeridos (Paso 3)
    private String codigo;
    private String descripcion;
    private int stock;

    /**
     * Constructor vacío por defecto.
     * Permite crear una instancia de Producto sin inicializar sus atributos internamente.
     */
    public Producto() {
    }

    /**
     * Constructor con todos los parámetros para inicializar un Producto.
     *
     * @param codigo      El código único identificador del producto.
     * @param descripcion La descripción o nombre detallado del producto.
     * @param stock       La cantidad de unidades disponibles en inventario.
     */
    public Producto(String codigo, String descripcion, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    // Getters y Setters (Paso 3)

    /**
     * Obtiene el código identificador del producto.
     *
     * @return El código del producto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece o modifica el código del producto.
     *
     * @param codigo El nuevo código para el producto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return La descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece o modifica la descripción del producto.
     *
     * @param descripcion La nueva descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad de stock disponible.
     *
     * @return El stock actual del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece o modifica la cantidad de stock disponible.
     *
     * @param stock El nuevo stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString() para visualizar los datos (Paso 3)

    /**
     * Devuelve una representación en texto del objeto Producto con un formato alineado.
     *
     * @return Una cadena de texto formateada con el código, descripción y stock del producto.
     */
    @Override
    public String toString() {
        return String.format("Codigo = %-25s | Descripcion = %-30s  | Stock = %-20s",
                codigo, descripcion, stock);
    }

}
package com.duoc.llanquihueTour.ui;

import com.duoc.llanquihueTour.data.GestorDatos;
import com.duoc.llanquihueTour.model.CentroCultivo;
import com.duoc.llanquihueTour.model.Producto;
import com.duoc.llanquihueTour.model.Tour;
import java.util.ArrayList;

/**
 * Clase principal que actúa como el punto de entrada (Entry Point) del
 * sistema de Gestión Llanquihue Tour.
 * <p>
 * Esta clase se encarga de coordinar la ejecución del programa, demostrando
 * las siguientes funcionalidades:
 * </p>
 * <ul>
 * <li>Carga y filtrado de Tours desde un archivo de texto plano.</li>
 * <li>Gestión en memoria y despliegue de Centros de Cultivo asociados.</li>
 * <li>Filtrado y visualización de un catálogo de productos según su stock.</li>
 * </ul>

 */
public class Main {

    /**
     * Método principal (main) que ejecuta la simulación del sistema de turismo.
     * Realiza la lectura de datos a través del {@link GestorDatos} y aplica
     * los filtros lógicos requeridos para la consola.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        // Instanciamos el gestor de datos para los Tours
        GestorDatos gestor = new GestorDatos();
        String ruta = "tours.txt";

        System.out.println("====================================================================================================");
        System.out.println("                                SISTEMA DE GESTIÓN LLANQUIHUE TOUR       ");
        System.out.println("====================================================================================================\n");

        // ----------------------------------------------------------------
        // 1. GESTIÓN DE TOURS (Lectura desde archivo, Recorrido y Filtrado)
        // ----------------------------------------------------------------
        System.out.println("                    --- 1. TODOS LOS TOURS DISPONIBLES (Desde Archivo) ---");
        System.out.println("Lista de Tour"); // <--- Agregamos el título arriba de la lista general
        System.out.println("----------------------------------------------------------------------------------------------------");

        ArrayList<Tour> todosLosTours = gestor.cargarTours(ruta);

        for (Tour t : todosLosTours) {
            if (!t.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(t);
            }
        }

        System.out.println("\n                    --- 2. TOURS FILTRADOS (Tipo: Gastronómico) ---");
        System.out.println("Lista de Tour Gastronómico"); // <--- Agregamos el título arriba del filtro
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Tour t : todosLosTours) {
            // SOLUCIÓN AQUÍ: Cambiamos t.getLocacion() por t.getTipo()
            if (t.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(t);
            }
        }

        System.out.println("\n--------------------------------------------------------------------------------------------------");

        // ----------------------------------------------------------------
        // 2. GESTIÓN DE CENTROS DE CULTIVO (Demostración de la Clase)
        // ----------------------------------------------------------------
        System.out.println("                    --- 3. CENTROS DE CULTIVO ASOCIADOS ---");
        ArrayList<CentroCultivo> centros = new ArrayList<>();
        centros.add(new CentroCultivo("CC01", "Centro Salmonero Llanquihue", "Lago Llanquihue"));
        centros.add(new CentroCultivo("CC02", "Cultivos de Ostras Anahuac", "Puerto Montt"));

        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------------");

        // ----------------------------------------------------------------
        // 3. GESTIÓN DE PRODUCTOS (Demostración de la Clase y Filtrado de Stock)
        // ----------------------------------------------------------------
        System.out.println("                    --- 4. CATÁLOGO DE PRODUCTOS (Filtrado Stock > 5) ---");
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P01", "Artesanía de Madera Nativa", 12));
        productos.add(new Producto("P02", "Frasco de Mermelada de Murta", 3)); // No debería aparecer el if pide que sea mayor a 5 el stock
        productos.add(new Producto("P03", "Licor de Oro Tradicional", 8));

        for (Producto p : productos) {
            if (p.getStock() > 5) {
                System.out.println(p);
            }
        }

        System.out.println("\n==================================================================================================");
        System.out.println("                          PROCESO TERMINADO CON ÉXITO - REVISIÓN OK");
        System.out.println("====================================================================================================");
    }
}
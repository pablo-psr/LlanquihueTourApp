package com.duoc.llanquihueTour.data;

import com.duoc.llanquihueTour.model.Tour;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de la persistencia y lectura de datos del sistema.
 * <p>
 * Proporciona los mecanismos necesarios para cargar información desde archivos externos
 * (como archivos de texto plano en los recursos del proyecto) y transformarla en objetos
 * de negocio utilizables por la aplicación.
 * </p>
 */
public class GestorDatos {

    /**
     * Lee un archivo de texto plano desde la carpeta de recursos de Maven,
     * procesa cada línea separada por punto y coma (;) y genera una lista de objetos Tour.
     * <p>
     * El método incluye validaciones para asegurar que el archivo exista, que cada línea
     * contenga la estructura correcta de 4 columnas y que el precio sea un valor numérico válido.
     * </p>
     *
     * @param nombreArchivo El nombre o ruta relativa del archivo dentro de la carpeta resources (ej. "tours.txt").
     * @return Un {@link ArrayList} que contiene los objetos {@link Tour} cargados exitosamente.
     * Si ocurre un error o el archivo está vacío, retorna una lista vacía.
     */
    // Método corregido para leer las 4 columnas (incluyendo Locación y Tipo)
    public ArrayList<Tour> cargarTours(String nombreArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Buscamos el archivo directamente en la carpeta de recursos de Maven
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreArchivo)) {

            // Validamos si el archivo realmente existe en resources
            if (is == null) {
                System.out.println("Error: No se encontró el archivo '" + nombreArchivo + "' en la carpeta resources.");
                return listaTours;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String linea;

                while ((linea = br.readLine()) != null) {
                    // separamos los datos por punto y coma
                    String[] datos = linea.split(";");

                    // CAMBIO AQUÍ: Ahora validamos que la línea tenga las 4 columnas requeridas
                    if (datos.length == 4) {
                        // El método .trim() elimina espacios fantasmas al inicio o final de cada texto
                        String nombre = datos[0].trim();
                        String locacion = datos[1].trim();
                        String tipo = datos[2].trim();
                        // Convertimos el precio a entero de forma segura
                        int precio = Integer.parseInt(datos[3].trim());

                        // Creamos el objeto Tour pasando los 4 parámetros ordenados
                        Tour nuevoTour = new Tour(nombre, locacion, tipo, precio);
                        // Lo agregamos al ArrayList
                        listaTours.add(nuevoTour);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato numérico del archivo: " + e.getMessage());
        }

        return listaTours;
    }
}
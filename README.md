# Sistema de Gestión Llanquihue Tour

¡Bienvenido al **Sistema de Gestión Llanquihue Tour**! Este es un proyecto desarrollado en Java (estructurado con Maven) diseñado para administrar servicios turísticos, inventario de productos locales y centros de cultivo asociados en la hermosa cuenca del Lago Llanquihue y sus alrededores.

El sistema demuestra el uso de Programación Orientada a Objetos (POO), persistencia de datos mediante lectura de archivos planos, manejo de excepciones y filtrado de colecciones en memoria.

---

## Características del Proyecto

El sistema está dividido en tres módulos principales de gestión:

1. **Gestión de Tours:**
   * Carga dinámica de datos desde un archivo de texto (`tours.txt`) ubicado en los recursos de Maven.
   * Procesamiento y sanitización de cadenas de texto (eliminación de espacios fantasma con `.trim()`).
   * Filtrado lógico en consola para separar tours generales de tours especializados (ej. Gastronómicos).

2. **Gestión de Centros de Cultivo:**
   * Registro en memoria de centros salmoneros y acuícolas asociados a las rutas turísticas.

3. **Gestión de Productos (Catálogo):**
   * Control de inventario y stock de artesanías y licores tradicionales.
   * Filtrado inteligente para mostrar únicamente productos con stock crítico o disponible (Stock > 5).

---

##  Estructura del Código

El proyecto sigue una arquitectura limpia organizada por paquetes, separando las responsabilidades de datos, lógica/modelos y presentación:

```text
src/main/java/com/duoc/llanquihueTour/
├── data/
│   └── GestorDatos.java        # Encargado de la lectura del archivo tours.txt (Resource Stream)
├── model/
│   ├── CentroCultivo.java      # Molde para los centros acuícolas/salmoneros
│   ├── Producto.java           # Molde para el catálogo y stock de productos locales
│   └── Tour.java               # Molde para las actividades turísticas
└── ui/
    └── Main.java               # Punto de entrada de la aplicación y lógica de consola

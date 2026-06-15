Aquí tienes todo el documento unificado en formato Markdown puro para tu archivo `README.md`.

# Sistema de Gestión Llanquihue Tour 🌲🐟

¡Bienvenido al **Sistema de Gestión Llanquihue Tour**! Este es un proyecto desarrollado en Java (estructurado con Maven) diseñado para administrar servicios turísticos, inventario de productos locales y centros de cultivo asociados en la hermosa cuenca del Lago Llanquihue y sus alrededores.

El sistema demuestra el uso de Programación Orientada a Objetos (POO), persistencia de datos mediante lectura de archivos planos, manejo de excepciones y filtrado de colecciones en memoria.

---

## 🚀 Características del Proyecto

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

## 📂 Estructura del Código

El proyecto sigue una arquitectura limpia organizada por paquetes, separando las responsabilidades de datos, lógica/modelos y presentación:

* **src/main/java/com/duoc/llanquihueTour/**
* **data/**
* `GestorDatos.java` — Encargado de la lectura del archivo tours.txt (Resource Stream)


* **model/**
* `CentroCultivo.java` — Molde para los centros acuícolas/salmoneros
* `Producto.java` — Molde para el catálogo y stock de productos locales
* `Tour.java` — Molde para las actividades turísticas


* **ui/**
* `Main.java` — Punto de entrada de la aplicación y lógica de consola





### ⚙️ Funcionamiento de las Capas y Clases

* **com.duoc.llanquihueTour.model (Modelos de Datos):** Contiene las clases de negocio (`Tour`, `Producto`, `CentroCultivo`) que actúan como moldes de objetos. Cuentan con constructores encapsulados, métodos *Getter/Setter* y sobreescrituras del método `toString()` utilizando `String.format()` para asegurar un despliegue alineado en bloques de texto en la consola.
* **com.duoc.llanquihueTour.data (Persistencia y Datos):** Aloja al `GestorDatos`, el cual se comunica con el sistema de archivos de manera segura a través de un bloque *try-with-resources* utilizando `BufferedReader`. Su función es aislar la lógica de lectura y empaquetar las líneas de texto parseadas por caracteres de división (`;`) en un formato nativo orientando a objetos (`ArrayList<Tour>`).
* **com.duoc.llanquihueTour.ui (Capa de Presentación):** Representada por la clase `Main`. Es el orquestador principal que consume los datos entregados por la capa `data` y gestiona las colecciones en memoria de los módulos de productos y centros de cultivo, implementando condicionales lógicos (`if`) para los filtros por consola.

---

## ⚙️ Instrucciones para Clonar y Ejecutar el Proyecto

Sigue estos pasos para poner en marcha el proyecto en tu entorno local:

1. **Clona el repositorio desde GitHub:**
`[git clone (https://github.com/pablo-psr/LlanquihueTourApp.git)`
2. **Verificación de SDK:** Asegúrate de tener configurado un SDK de Java compatible en tu IDE (JDK 17 o superior recomendado para los proyectos actuales de Duoc UC).
3. **Ejecución:** Abre el proyecto en tu IDE preferido (NetBeans, IntelliJ o Eclipse) y ejecuta el archivo `Main.java` ubicado dentro de la ruta:
`src/main/java/com/duoc/llanquihueTour/ui/Main.java`

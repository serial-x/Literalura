# Literalura 📝

Desarrollo del Challenge de gestión de libros, solicitado por Alura Latam en colaboración con Oracle en el programa ONE, como parte de la especialización Back-End.

## Descripción 📝

Este proyecto es un Gestor de Libros desarrollado en Java que te permite buscar libros por título, autores por nombre, listar libros y autores registrados, y obtener estadísticas generales sobre la base de datos de libros. La aplicación interactúa con una API externa para obtener información y utiliza una base de datos local para almacenar y gestionar los datos de libros y autores.

## Pilares Tecnológicos 💡

- **Java**: Lenguaje principal de desarrollo.
- **Spring Boot**: Framework utilizado para la configuración y desarrollo del backend.
- **PostgreSQL**: Sistema de base de datos relacional.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

## Estructura del Proyecto 🗂️

### Principal.java

El punto de entrada principal del programa. Aquí se maneja la interacción con el usuario a través de la consola, mostrando un menú de opciones y gestionando las consultas sobre libros y autores.

#### Funcionalidades principales:

- Buscar libro por título.
- Buscar autor por nombre.
- Listar libros registrados.
- Listar autores registrados.
- Listar autores vivos en un determinado año.
- Listar libros por idioma.

### ConsumoApi.java

Clase responsable de realizar consultas a una API externa para obtener información sobre libros y autores.

### ConvierteDatos.java

Esta clase se encarga de convertir los datos obtenidos de la API para su uso en la aplicación.

### AutorRepository.java

Interfaz que maneja las operaciones de la base de datos relacionadas con los autores.

### Autor.java

La clase `Autor` representa la entidad "Autor" en la base de datos. Esta clase incluye atributos como el nombre del autor, su fecha de nacimiento y fallecimiento, así como una lista de libros asociados. La relación entre autores y libros se gestiona mediante una asociación de uno a muchos.

#### Atributos principales:
- **id**: Identificador único del autor.
- **nombre**: Nombre del autor.
- **fechaDeNacimiento**: Año de nacimiento del autor.
- **fechaDeFallecimiento**: Año de fallecimiento del autor (puede ser nulo si el autor está vivo).
- **libros**: Lista de libros escritos por el autor.

### Datos.java

La clase `Datos` se utiliza para mapear la estructura JSON de la respuesta de la API. Esta clase contiene el total de resultados y una lista de libros obtenidos de la API.

#### Atributos principales:
- **total**: Número total de resultados.
- **libros**: Lista de objetos `DatosLibro` que representan los libros obtenidos de la API.

### DatosLibro.java

La clase `DatosLibro` representa la información de un libro obtenida de la API. Esta clase incluye atributos como el título del libro, una lista de autores, los idiomas en los que está disponible y el número de descargas.

#### Atributos principales:
- **titulo**: Título del libro.
- **autores**: Lista de objetos `DatosAutor` que representan los autores del libro.
- **idiomas**: Lista de idiomas en los que está disponible el libro.
- **numeroDeDescargas**: Número de descargas del libro.


## 👨‍💻 Desarrollado por
- Pérez Juan Eduardo

## Instrucciones de Uso 📋
Descarga o clona el repositorio desde GitHub
Abre el proyecto en IntelliJ IDEA o tu IDE favorito.
Configura la conexión a la base de datos en el archivo de propiedades correspondiente.
Ejecuta la aplicación desde la clase Principal.java.
Sigue las instrucciones en pantalla para buscar libros, autores y obtener estadísticas.

Disfruta gestionando tu biblioteca de libros!

## Esquema Básico de  una Api Rest

Este es un esquema básico de una api rest con spring boot.


## Archvios

Los siguientes archivos son los necesarios para hacer funcionar un endpoint con base de datos:

- **application.properties:** Configuracion de la base de datos.
- **personaController.java:** Manejador del endpoint persona.
- **Users.java:** Entidad que se mapea con una tabla en la base de datos.
- UserService.java:** Logica de las consultas a una tabla.
- **XXXRepository.java:** Encapsula el comportamiento de almacenamiento, recuperacion y busqueda que emula una coleccion de objetos. Los usamos en los servicios.


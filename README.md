# Proyecto Alumno - Spring Boot

Este proyecto es una aplicación simple para manejar una entidad **Alumno** usando Spring Boot, siguiendo una arquitectura básica con capas Controller, Service y DAO. Se usa almacenamiento en memoria para fines de demostración.

---

## Características

- CRUD completo para la entidad Alumno
- Endpoints REST para listar, obtener, crear, actualizar y eliminar alumnos
- Estructura modularizada con DAO, Service y Controller
- Uso de Spring Framework con anotaciones REST
- Almacenamiento temporal en memoria (HashMap)

---

## Entidad Alumno

Los atributos de Alumno son:

- `id` (Long)
- `nombre` (String)
- `apellido` (String)
- `email` (String)
- `edad` (int)

---

## Endpoints disponibles

| Método | URL                 | Descripción                   |
|--------|---------------------|-------------------------------|
| GET    | /alumno             | Listar todos los alumnos       |
| GET    | /alumno/{id}        | Obtener alumno por ID          |
| POST   | /alumno             | Crear un nuevo alumno          |
| PUT    | /alumno/{id}        | Actualizar alumno existente    |
| DELETE | /alumno/{id}        | Eliminar alumno por ID         |

---

## Cómo usar

1. Clona el repositorio  
   ```bash
   git clone https://github.com/Vania-0731/lab08_ejer02.git
   
   cd tu_repositorio
   ```

2. Importa el proyecto en tu IDE favorito (IntelliJ, Eclipse)

3. Ejecuta la aplicación Spring Boot

4. Usa Postman o cualquier cliente HTTP para probar los endpoints

---


## Tecnologías usadas

- Java 11+
- Spring Boot 2.x
- Maven o Gradle (según configuración)
- REST APIs

---

## Notas

- Este proyecto usa almacenamiento en memoria, por lo que los datos se perderán al detener la aplicación.
- Ideal para propósitos educativos y pruebas rápidas.


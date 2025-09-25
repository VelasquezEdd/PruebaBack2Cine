Este proyecto corresponde a una prueba técnica para modelar el sistema de gestión de proyecciones y reservas de un cine.  
Se construyó la capa de modelos en Spring Boot con conexión a base de datos relacional mediante JPA/Hibernate, definiendo entidades, atributos y relaciones.

📝 Requerimiento

Se implementaron 5 entidades principales con sus atributos y relaciones:

1. Cliente
2. Perfil
3. Película
4. Sala
5. Reserva

### Relaciones implementadas
- Un Cliente puede tener muchas Reservas (1:N).
- Una Reserva corresponde a una sola Película (N:1).
- Una Reserva se realiza en una sola Sala, y cada Sala puede tener varias Reservas (1:N).
- Cada Cliente tiene asociado un único Perfil (1:1).


🛠️ Tecnologías usadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Base de datos relacional (ej: MySQL o PostgreSQL)
- Jackson (`@JsonManagedReference` / `@JsonBackReference`) para evitar ciclos en serialización.

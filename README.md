# NTTDATA-TALLERSPRING

Elaborar un nuevo proyecto web en base a las siguientes indicaciones:

Se utilizará el modelo de capas propuesto por Spring del que sólo se hará uso de las capas de servicios y repositorio que será consumida desde la clase principal (main) La estructura de paquetes estará determinada por éste modelo.

El modelo de datos será una tabla (Cliente) cuyos atributos serán identificador numérico, nombre, apellidos, fecha de nacimiento y número de documento de identidad. Se requiere implementar JPA (Hibernate) para definir la entidad.

Se requiere la implementación del patrón Repositorio sobre las entidades. Sobre el repositorio de Cliente se creará además un servicio que busque mediante nombre y apellidos.

Se creará un servicio de gestión de Clientes que consuma el repositorio correspondiente. Desde la clase principal se consumirá el servicio haciendo uso del método creado en el repositorio así como de los métodos CRUD proporcionados por Spring Data.

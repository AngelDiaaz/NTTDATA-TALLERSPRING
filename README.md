# NTTDATA-TALLERSPRING

Elaborar un nuevo proyecto web en base a las siguientes indicaciones:

Se utilizará el modelo de capas propuesto por Spring del que sólo se hará uso de la capa servicios que será consumida desde la clase principal (main) La estructura de paquetes estará determinada por éste modelo. El modelo de datos o persistencia puede ser simulado sin necesidad de acceso a BBDD.

La aplicación contará con las clases Pedido y Producto (relación 1-N) Un pedido tiene de 1 a N productos. Un pedido tendrá un identificador, un destinatario, una dirección de entrega y un indicador de si la entrega es a Melilla, Ceuta o Canarias. Un producto tendrá un identificador, nombre, un precio PVP y un precio sin impuestos. 

El precio PVP del Producto se calculará en función del indicador de envío. Si el envío se realiza dentro de la península se aplicará el IVA al 21% sobre el valor del producto. Si el envío es para Ceuta, Melilla o Canarias se aplicará el IPSI al 4% sobre el valor del producto.

La aplicación requiere que se cree una interfaz de servicio que defina la resolución y retorno del Producto con su precio PVP calculado en base al indicador de la zona de envío del Pedido. Esta interfaz será implementada por dos servicios (uno para península y otro para el comunidades indicadas) La aplicación, desde la clase principal, consumirá estos servicios en base al indicador de zona y mostrará el valor total los pedidos.


📇# Sistema de Gestión de Contactos en Java (Swing)

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando Swing (JFrame) que permite gestionar una agenda de contactos personales. Implementa las operaciones básicas CRUD (Crear, Leer, Actualizar, Eliminar) conectándose con una base de datos mediante un controlador (ContactoController).
🧩 # Funcionalidades

✔️ Listar contactos:
Carga automáticamente los contactos almacenados en la base de datos al iniciar la aplicación.
Se muestran en una tabla con columnas: Id, Nombre, Apellido, Teléfono, Correo, Dirección.

✔️ Buscar contacto por ID:
Permite buscar un contacto específico ingresando su número de identificación.
Si no se encuentra, muestra un mensaje de alerta.

✔️ Agregar nuevo contacto:
Permite registrar un nuevo contacto completando todos los campos del formulario.
Se valida que ningún campo esté vacío y que el número de identificación sea un número.

✔️ Editar contacto existente:
Al seleccionar un contacto en la tabla, sus datos se cargan en el formulario.
Puedes modificarlos y guardar los cambios. Se valida que el número de teléfono no exceda 15 caracteres.

✔️ Eliminar contacto:
Selecciona un contacto y elimina su registro con confirmación previa.

✔️ Limpiar formulario:
Borra todos los campos del formulario para ingresar nuevos datos.

✔️ Actualizar tabla:
Recarga la lista de contactos desde la base de datos.

✔️ Volver al menú principal:
Redirecciona a la ventana MainFrame.

🛠️ # Estructura del Proyecto

src/
├── controller/
│   └── ContactoController.java  # Lógica de negocio y conexión con la base de datos
├── model/
│   └── Contacto.java            # Clase que representa el modelo de datos Contacto
├── view/
│   └── ContactoForm.java        # Interfaz gráfica del usuario (formulario principal)
│   └── MainFrame.java           # Menú principal (opcional)

🖼️ # Tecnologías Utilizadas

    Java SE (JDK 8+)

    Swing (JFrame) para la interfaz gráfica

    JDBC (u otro método de persistencia)

    NetBeans IDE recomendado para desarrollo y diseño visual

🚀 # Cómo Ejecutar

    Clona el repositorio o descarga el proyecto.

    Abre el proyecto en NetBeans u otro IDE compatible.

    Configura la conexión a la base de datos en ContactoController.java.

    Ejecuta la clase ContactoForm.

🔐 # Validaciones Implementadas

    El campo Identificación solo acepta números.

    Todos los campos deben estar completos para guardar o editar un contacto.

    El número de teléfono tiene una longitud máxima de 15 caracteres.

    Mensajes emergentes informan sobre el éxito o error en cada operación.

💡 # Posibles Mejoras Futuras

    Exportación de contactos a Excel o PDF.

    Validación de correos electrónicos.

    Filtro por nombre, apellido o correo.

    Paginación en la tabla para grandes volúmenes de datos.

    Conexión con bases de datos como MySQL o PostgreSQL.

    Uso de patrón MVC completo con DAOs.
👤 Autor

Carlos Viveros
Proyecto académico con fines de aprendizaje en Java.

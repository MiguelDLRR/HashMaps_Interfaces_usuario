# HashMaps_Interfaces_usuario
Uso de estructuras de datos avanzadas, control de excepciones, serialización y creación de interfaces de usuario

OBJETIVOS
  - Escribir programas que manipulen información seleccionando y utilizando los tipos avanzados
    de datos facilitados por el lenguaje.
  - Utilizar las clases básicas para almacenar y procesar información (listas y tablas de Hash).
  - Implementar la gestión de excepciones en la utilización de clases facilitadas por el lenguaje.
  - Implementar el lanzamiento de excepciones.
  - Crear programas que accedan a la información serializada en ficheros.
  - Desarrollar interfaces gráficas utilizando las librerías adecuadas.
  - Programar controladores de eventos.
1 Crea la clase Empleado con la siguiente información: un nombre, un apellido, un sueldo y una
clave que tendrá por defecto el valor “patata”. Crea una clase con los atributos necesarios para
almacenar los datos de cada empleado y los métodos constructores, getters y setters. La clase
Empleado debe poder serializarse, excepto el atributo que guarda la clave.

2 Crea la clase VentanaPrincipal con el método main. Al ejecutarse deberá:
  -crear varios empleados , almacenarlos en una HashMap según su nombre y guardar
  este HashMap en un archivo.
  -Iniciar una ventana definida en la clase VentanaBienvenida.
3 Crea la clase VentanaBienvenida para que:
  -muestre una ventana con los siguientes elementos:
        -Una caja de texto para introducir el nombre.
        -Una caja tipo JPasswordField para introducir el password (que será el apellido)
        -Un botón Login.
  -Crea una clase ErrorLeerArchivo que herede de Exception. Si no se puede acceder al
  archivo lanza un error.
  -Al abrir la ventana llama a una función “leerArchivo()” que intente acceder al archivo
  con la información de los empleados:
        -Si puede acceder, muestre por consola todos los datos almacenados en el
        archivo en el que se almacenó la HashMap y se guarden en una variable de la
        clase VentanaBienvenida.
        -Si no puede acceder, lance una excepción del tipo “ErrorLeerArchivo” que va a
        tener que controlar la clase VentanaBienvenida mostrando un mensaje al
        usuario.
        -El nombre del archivo debe de ser una variable privada de la clase
        VentanaBienvenida.

  -programa el botón Login de tal forma que cuando se haga clic en él, compruebe que el
  usuario existe en el archivo con el nombre y mismo apellido (introducido en el
  password) indicado por el usuario.
        -Si todo es correcto, se abrirá una nueva ventana dando la bienvenida al usuario
        con su apellido y un botón para cerrar la aplicación
        -Si el usuario no rellena ningún campo se mostrará el texto oculto “DEBES
        INTRODUCIR LOS DATOS” en color rojo
        -Si el nombre o password (el apellido) no concuerda se mostrará el texto
        “CREDENCIALES INCORRECTAS” en color rojo  


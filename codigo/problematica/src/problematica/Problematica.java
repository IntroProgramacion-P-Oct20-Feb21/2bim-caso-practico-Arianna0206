/*
* Que permita ingresar nuevas cuentas de diversas plataformas. 
* Las plataformas son:
* Facebook (se necesita los siguientes datos: nombre de usuario, 
* edad, ciudad, pais, correo electrónico)
* Twitter (se necesita los siguientes datos: nombre de usuario, 
* nombres, apellidos, edad, ciudad, pais, idioma, correo electrónico)
* Whatsapp (se necesita los siguientes datos: nombre de usuario, número 
* de teléfono, edad, ciudad, pais)
* Telegram (se necesita los siguientes datos: nombre de usuario, 
* número de teléfono, ciudad, pais, área de interés)
* Signal (se necesita los siguientes datos: nombre de usuario, 
* número de teléfono, ciudad, pais, hobby principal)
* Instagram (se necesita los siguientes datos: nombre de usuario, 
* ciudad, edad, correo electrónico)
* Flickr (se necesita los siguientes datos: nombre de usuario, 
* correo electrónico)
* La aplicación debe tener los siguientes procedimientos:

* método principal - main
* método crearFacebook - (método que devuelve un valor)
* método crearTwitter - (método que no devuelve un valor)
*método crearWhatsapp - - (método que devuelve un valor)
* método crearTelegram - (método que no devuelve un valor)
* método crearSignal- (método que devuelve un valor)
* método crearInstagram - (método que no devuelve un valor)
* método crearFlickr - (método que devuelve un valor)
* En la función principal se presenta un ciclo repetitivo que 
* presenta un menú de opciones:

* Si se ingresa 1 se llamará a crearFacebook
* Si se ingresa 2 se llamará a crearTwitter
* Si se ingresa 3 se llamará a crearWhatsapp
* Si se ingresa 4 se llamará a crearTelegram
* Si se ingresa 5 se llamará a crearSignal
* Si se ingresa 6 se llamará a crearInstagram
* Si se ingresa 7 se llamará a crearFlickr

* En cada iteración del ciclo; se pregunta al usuario si se 
* desea salir del ciclo.

* Cada método que no devuelva valores debe imprimir un resumen 
* de la cuenta creada con todos los valores ingresados

* Cada método que devuelva valores debe hacer un return con un 
* resumen de la cuenta creada con todos los valores ingresados

* Cuando el usuario termina el ciclo repetitivo se debe presentar 
* un mensaje con base al número total de cuentas creadas. Se debe usar 
* el número total de cuentas como argumento (entero) de una función 
* llamada obtenerMensaje

* En la función obtenerMensaje existe un parámetro. 
* El mensaje se forma de la siguiente manera:
* Se usa el siguiente arreglo unidimensional:  

* (mensajeFinal(3),x(300)[{a-z}, {A-Z}, {BS}])

* Los datos asignados al arreglo son:

* mensajeFinal <-- {"Campaña con poca afluencia", 
* "Campaña moderada siga adelante", "Excelente campaña"}
* a. Si el número de cuentas creadas está en el rango de 1 a 5 
* el mensaje será: Campaña con poca afluencia

* b. Si el número de cuentas creadas está en el rango de 6 a 15 
* el mensaje será: Campaña moderada siga adelante

* c. Si el número de cuentas creadas está en el rango de 16 en 
* adelante, el mensaje será: Excelente campaña
 */
package problematica;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se declara las variables 
        Scanner entrada = new Scanner(System.in);
        String reporte = "";
        int salir;
        int opcion;
        int contador = 0;
        boolean bandera = true;

        while (bandera) {

            System.out.println("Ingrese una opción: \n"
                    + "Ingrese 1 para la cuenta de Facebook\n"
                    + "Ingresa 2 para la cuenta de Twitter\n"
                    + "Ingresa 3 para la cuenta de WhatsApp\n"
                    + "Ingresa 4 para la cuenta de Telegram\n"
                    + "Ingresa 5 para la cuenta de Signal\n"
                    + "Ingresa 6 para la cuenta de Instagram\n"
                    + "Ingresa 7 para la cuenta de Flickr\n");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                String cadena1 = crearFacebook();
                System.out.println(cadena1);
            } else {
                if (opcion == 2) {
                    crearTwitter();
                } else {
                    if (opcion == 3) {
                        String cadena2 = crearWhatsApp();
                        System.out.println(cadena2);
                    } else {
                        if (opcion == 4) {
                            crearTelegram();
                        } else {
                            if (opcion == 5) {
                                String cadena3 = crearSignal();
                                System.out.println(cadena3);
                            } else {
                                if (opcion == 6) {
                                    crearInstagram();
                                } else {
                                    if (opcion == 7) {
                                        String cadena4 = crearFlickr();
                                        System.out.println(cadena4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((opcion >= 1) && (opcion <= 7)) {
                contador = contador + 1;
            } else {
                System.out.printf("Error, intente colocar los números "
                        + "presentados\n");
            }

            System.out.println("Ingresar 2 para dejar de ingresar más "
                    + "datos");
            salir = entrada.nextInt();
            if (salir == 2) {
                bandera = false;
            }
        }

        System.out.printf("Total de cuentas = %s\n", contador);
        reporte = obtenerMensaje(contador);
        System.out.println(reporte);

    }

    // Se desarrolla una funcion para crear una cuenta en Facebook
    public static String crearFacebook() {

        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String usuario;
        int edad;
        String ciudad;
        String pais;
        String correo;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine(); // Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa el país que se encuentra la ciudad");
        pais = entrada.nextLine();
        System.out.println("Ingresa tu correo electrónico");
        correo = entrada.nextLine();

        cadena = String.format("El cliente crea una cuenta en Facebook con "
                + "nombre de usuario %s con una edad de %d años en %s - %s "
                + "con un correo electrónico %s\n",
                usuario,
                edad,
                ciudad,
                pais,
                correo);

        return cadena;
    }

    // Se desarrolla un procedimiento para crear una cuenta en Twitter
    public static void crearTwitter() {

        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombres;
        String apellidos;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;

        System.out.println("Ingrese sus nombres completos");
        nombres = entrada.nextLine();
        System.out.println("Ingrese sus apellidos completos");
        apellidos = entrada.nextLine();
        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine();// Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa el país que se encuentra la ciudad");
        pais = entrada.nextLine();
        System.out.println("Ingresa el idioma que se habla en el país");
        idioma = entrada.nextLine();
        System.out.println("Ingresa tu correo electrónico");
        correo = entrada.nextLine();

        System.out.printf("El cliente %s %s crea una cuenta en Twitter que "
                + "ingresa como nombre de usuario %s con una edad de %d "
                + "años en %s - %s con un idioma %s e ingresa como correo "
                + "electrónico %s\n",
                nombres,
                apellidos,
                usuario,
                edad,
                ciudad,
                pais,
                idioma,
                correo);
    }

    // Se desarrolla una función para crear una cuenta en WhatsApp
    public static String crearWhatsApp() {

        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String usuario;
        int celular;
        int edad;
        String ciudad;
        String pais;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de celular");
        celular = entrada.nextInt();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine();//Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa el país que se encuentra la ciudad");
        pais = entrada.nextLine();

        cadena = String.format("El cliente crea una cuenta en WhatsApp ingresa "
                + "como nombre de usuario %s con número de celular 0%d "
                + "tiene %d años de edad en %s - %s\n",
                usuario,
                celular,
                edad,
                ciudad,
                pais);

        return cadena;
    }

    // Se desarrolla un procedimiento para crear una cuenta en Telegram
    public static void crearTelegram() {

        Scanner entrada = new Scanner(System.in);
        String usuario;
        int celular;
        int edad;
        String ciudad;
        String pais;
        String areaInteres;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de celular");
        celular = entrada.nextInt();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine();//Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa el país que se encuentra la ciudad");
        pais = entrada.nextLine();
        System.out.println("Ingresa una área de tu interés");
        areaInteres = entrada.nextLine();

        System.out.printf("El cliente crea una cuenta en Telegram ingresa "
                + "como nombre de usuario %s con número de celular 0%d "
                + "tiene %d años de edad en %s - %s y tiene interés en la "
                + "área de %s\n",
                usuario,
                celular,
                edad,
                ciudad,
                pais,
                areaInteres);
    }

    // Se desarrolla una función para crear una cuenta en Signal
    public static String crearSignal() {

        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String usuario;
        int celular;
        String ciudad;
        String pais;
        String hobby;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de celular");
        celular = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine();// Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa el país que se encuentra la ciudad");
        pais = entrada.nextLine();
        System.out.println("Ingresa tu hobby principal");
        hobby = entrada.nextLine();

        cadena = String.format("El cliente crea una cuenta en Signal ingresa "
                + "como nombre de usuario %s con un número de celular 0%d "
                + "en %s - %s, su hobby principal es %s\n",
                usuario,
                celular,
                ciudad,
                pais,
                hobby);

        return cadena;
    }

    // Se desarrolla un procedimiento para crear una cuenta Instagram
    public static void crearInstagram() {

        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String correo;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingresa tu edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa la ciudad en la que resides");
        entrada.nextLine();// Limpieza de Buffer
        ciudad = entrada.nextLine();
        System.out.println("Ingresa tu correo electrónico");
        correo = entrada.nextLine();

        System.out.printf("El cliente crea una cuenta en Instagram ingresa "
                + "como nombre usuario %s tiene %d años de edad en la ciudad "
                + "de %s con un correo electrónico %s\n",
                usuario,
                edad,
                ciudad,
                correo);
    }

    // Se desarrolla una función para crear una cuenta en Flickr
    public static String crearFlickr() {

        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String usuario;
        String correo;

        System.out.println("Ingresa un nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingresa tu correo electrónico");
        correo = entrada.nextLine();

        cadena = String.format("El cliente crea una cuenta en Flickr ingresa "
                + "como nombre de usuario %s con un correo electrónico %s\n",
                usuario,
                correo);

        return cadena;
    }

    // Se crea una funcion para evaluar las redes sociales 
    public static String obtenerMensaje(int contador) {

        String cadenaFinal = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};

        if ((contador >= 1) && (contador <= 5)) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, mensajeFinal[0]);
        } else {
            if ((contador >= 6) && (contador <= 15)) {
                cadenaFinal = String.format("%s%s\n", cadenaFinal,
                        mensajeFinal[1]);
            } else {
                if (contador >= 16) {
                    cadenaFinal = String.format("%s%s\n", cadenaFinal,
                            mensajeFinal[2]);
                }else{
                    if(contador == 0){
                        cadenaFinal = String.format("No hay cuentas ingresadas\n");
                    }
                }
            }
        }
        return cadenaFinal;
    }

}

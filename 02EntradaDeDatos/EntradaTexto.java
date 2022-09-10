//esto es un comentario

/**
 * Todo programa en java debe de tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradaTexto {
    // los limites

    // metodo principal
    public static void main(String[] args) {
        // tipo de dato
        String nombre;
        // el ; es el fin de linea
        int edad;
        // instancia
        System.out.println("Por favor intuduce tu nombre asi bien kawaii");

        // Vamos a obtener el nombre del usuario

        nombre = System.console().readLine();

        System.out.println("Por favor intruduce tu edad");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + "Bienvenido a tu programa" + edad + "cumpleanos");
    }
}
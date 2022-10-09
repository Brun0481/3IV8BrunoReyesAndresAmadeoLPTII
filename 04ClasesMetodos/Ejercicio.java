import java.util.Scanner;

class Ejercicio {

    /*
     * Vamos hacer un programa en el cual vamos a tener las siguientes opcionesque
     * son
     * 1 otra calculador
     * 2 conversion de unidades
     * 3 crecion de cuadrito magico
     * 4 movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);
    // metodos o comportamientos de la clase
    // vamoss a crear un metodo para el menu
    /*
     * public es el acceso a el tipo de datos, clase o metodo cualquieer elemnto del
     * programa puedo accceder a el
     * private es de acceso restrigido solo mediante reglas se puede accerder a el
     * protected se puede tener acceso solo desde la misma clase y aplicando la
     * herencia de poo entre los hijos y padres
     *
     * Un metodo tambien es un tipo de dato aplicado
     */
    // La variable puede ser global
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elige una opcion");
        System.out.println("a-Claculadora");
        System.out.println("b-conversion de unidades");
        System.out.println("c-creacion de cuadros");
        System.out.println("d-Movimiento de un cuadro");
        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                // vamos hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                Ejercicio2();
                break;
            case 'c':
                Ejercicio3();
                break;
            case 'd':
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias ");
        }

    }

    // metodo
    public void Ejercicio1() {
        // calculadora
        // +-*%
        double num1 = 0.00, suma = 0.00, multiplicacion = 0.00;
        char operacion;

        System.out.println("Seleccionar la operacion que deseas realizar ");
        System.out.println("a.- Suma y resta");
        System.out.println("b.- Multiplicacion ");
        System.out.println("c- Division ");

        switch (operacion) {
            case 'a':
                /* que sume numeros como desee */
                do {
                    System.out.println("Para detener la opetracion  presione 0");
                    System.out.println("Escriba tantos numeros como quiera sumar o restar");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    // suma = suma + num1
                    System.out.println("El resultado es: " + suma);
                } while (num1 != 0);
                break;

            case 'b':
                do {
                    System.out.println("Para detener la opetracion  presione 0");
                    System.out.println("Escriba tantos numeros como quiera multiplicar");
                    num1 = entrada.nextDouble();
                    multiplicacion *= num1;
                    System.out.println("El resultado es: " + multiplicacion);
                } while (num1 != 0);
                break;

            case 'c':

        }

    }

    // metodo
    public void Ejercicio2() {
        /*
         * Realizar una corversion de metros cm y pulgadas
         * kg a libras y gramos
         * m/s a km/h
         */

        double metros = 0.00, kg = 0, vel = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libra = 2.20,
                ms = 0.00;

        double a, b;

        System.out.println("Seleciona la cantidadd que desee convertir");
        System.out.println("a.- metros a cm y pulgadas");
        System.out.println("b.- Kg a libras y gramos");
        System.out.println("c.- ");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                System.out.println("Ingrese la cxantidad en metros");
                metros = entrada.nextDouble();
                a = metros * gramos;
                b = metros * pulgadas;
                System.out.println(
                        "La cantidad de metros son: " + metros + "en cm son: " + cm + "en pulgadas son: " + pulgadas);
                break;

            case 'b':
                System.out.println("Ingrese la cantidad de kg");
                metros = entrada.nextDouble();
                a = kg * gramos;
                b = kg * libra;
                System.out.println(
                        "La cantidad de kilogramos son: " + kg + "en cm son: " + gramos + "en pulgadas son: " + libra);
                break;

            case 'c':
                System.out.println("Ingrese la cantidad de m/S");
                ms = entrada.nextDouble();
                a = ms * (3600 / 1000);
                System.out.println("La conversion de m/s a km es: " + a);
                break;

            default:
                System.out.println("Opcion no validad");

        }
    }

    }

    // metodo
    public void Ejercicio3() {

    }

    // metodo
    public void Ejercicio4() {
        /*
         * ]Vamos hacer un programa que se encarge de imprimir con
         * //////////
         ***********
         * ///////////
         **********
         */
    }

}

package cuentas;

/**
 * Clase principal que actúa como punto de entrada para la simulación bancaria.
 * * @author Manuel Fernandez
 * @version 1.0
 * @see CCuenta
 */
public class Main {

    /**
     * Punto de entrada principal de la aplicación.
     * Inicia la secuencia de operaciones llamando a operativa_cuenta con un valor inicial.
     * * @param args Argumentos de la línea de comandos para configuraciones externas (no utilizados en esta versión).
     */
    public static void main(String[] args) {
        operativa_cuenta(2300.0f);
    }

    /**
     * Encapsula la lógica de negocio para operar con una cuenta bancaria específica.
     * Este método realiza un flujo completo: instanciación, consulta de estado, 
     * retiro de efectivo basado en un parámetro y un ingreso fijo de prueba.
     * * @param cantidad Valor de tipo float que define la cuantía a retirar durante la operación.
     * @since 1.0
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
package cuentas;

/**
 * Clase que gestiona las operaciones bancarias de una cuenta.
 * Permite consultar el estado, ingresar y retirar dinero.
 * * @author Manuel Fernandez
 * @version 1.0
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de la cuenta bancaria */
    private String cuenta;
    /** Saldo disponible en la cuenta */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInterés;

    /**
     * Constructor sin parámetros.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos.
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para realizar ingresos en la cuenta.
     * @param cantidad Importe a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para realizar retiradas de dinero.
     * @param cantidad Importe a retirar
     * @throws Exception Si la cantidad es negativa o el saldo es insuficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** @return el nombre del titular */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre el nombre del titular a establecer */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return el número de cuenta */
    public String getCuenta() {
        return cuenta;
    }

    /** @param cuenta el número de cuenta a establecer */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** @return el saldo actual */
    public double getSaldo() {
        return saldo;
    }

    /** @param saldo el saldo a establecer */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** @return el tipo de interés */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** @param tipoInterés el tipo de interés a establecer */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
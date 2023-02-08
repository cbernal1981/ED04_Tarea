/**
 * Clase CCuenta para representar cuentas bancarias.
 * 
 * @author [Tu nombre aquí]
 * @version [Versión del proyecto aquí]
 */
package ccuentas;

public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;

    /**
     * Tasa de interés asociada a la cuenta.
     */
    private double tipoInterés;

    /**
     * Crea una nueva cuenta sin especificar los detalles.
     */
    public CCuenta()
    {
    }

    /**
     * Crea una nueva cuenta con los detalles especificados.
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta bancaria
     * @param sal Saldo actual de la cuenta
     * @param tipo Tasa de interés asociada a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Devuelve el nombre del titular de la cuenta
	 * @return Nombre del titular de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular de la cuenta
	 * @param nombre Nombre del titular de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el número de cuenta.
	 * @return número de cuenta.
	 */
	private String getCuenta() {
		return cuenta;
	}
	/**
	*Establece el número de cuenta.
	*@param cuenta número de cuenta.
	*/
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	*Devuelve el saldo de la cuenta.
	*@return saldo de la cuenta.
	*/
	private double getSaldo() {
		return saldo;
	}
	/**
	*Establece el saldo de la cuenta.
	*@param saldo saldo de la cuenta.
	*/
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	*Devuelve el tipo de interés de la cuenta.
	*@return tipo de interés de la cuenta.
	*/
	private double getTipoInterés() {
		return tipoInterés;
	}
	/**
	*Establece el tipo de interés de la cuenta.
	*@param tipoInterés tipo de interés de la cuenta.
	*/
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}

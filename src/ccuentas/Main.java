package ccuentas;
//neo eres un manta
/**
 * Clase principal que contiene el método main y el método operativa_cuenta.
 *
 * @author Cristian Bernal
 */
public class Main {
	/**
     * Método main que invoca al método operativa_cuenta.
     *
     * @param args Argumentos del programa.
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    /**
     * Método que realiza una serie de operaciones sobre una cuenta bancaria.
     *
     * @param cantidad Cantidad que se desea operar en la cuenta.
     */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
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

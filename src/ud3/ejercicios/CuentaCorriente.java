package ud3.ejercicios;

/*
 * Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
 * titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
 * ● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 * ● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
 * si existe saldo suficiente.
 * ● Ingresar dinero: se incrementa el saldo.
 * ● Mostrar información: muestra la información disponible de la cuenta corriente.
 */

/*
* E0702. En la clase CuentaCorriente sobrecarga los constructores para poder crear
* objetos:
* ● con el DNI del titular y un saldo inicial
* ● Con el DNI, nombre y saldo inicial.
* Utiliza el método this() para evitar duplicar código. Escribe un programa que compruebe el
* funcionamiento.
*/

/*
 * E0703. Modifica la visibilidad de la clase CuentaCorriente para que sea visible desde
 *  clases externas y la visibilidad de sus atributos para que:
 *  ● saldo no sea visible para otras clases
 * ● nombre sea público para cualquier clase
 * ● dni solo sea visible por clases vecinas.
 *  public class CuentaCorriente {
 * String dni;
 * public String titular;
 * private double saldo;Comprueba el funcionamiento y la visibilidad.
*/

public class CuentaCorriente {
    String dni = "";
    public String titular = "";
    private double saldo = 0;

    CuentaCorriente(String dni, String titular, double saldo) {
        if (!dni.isEmpty())
            this.dni = dni;
        if (!titular.isEmpty())
            this.titular = titular;
        if (saldo >= 0)
            this.saldo = saldo;
        System.out.println("Cuenta creada con éxito.");
    }

    CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0);
    }

    CuentaCorriente(String dni, double saldo) {
        this(dni, null, saldo);
    }

    public String sacarDinero(double dinero) {
        if (saldo < dinero)
            return "No hay saldo suficiente para retirar " + dinero + " euros de tu saldo.";
        else {
            this.saldo = this.saldo - dinero;
            return "Operación exitosa.";
        }
    }

    public void ingresarDinero(double dinero) {
        if (dinero >= 0)
            this.saldo = this.saldo + dinero;
    }

    public void mostrarInfo() {
        System.out.println("Nombre del titular: " + titular);
        System.out.println("    DNI: " + dni);
        System.out.println("    Saldo de la cuenta: " + saldo);
    }

    public static void main(String[] args) {
        CuentaCorriente Persona1 = new CuentaCorriente("52966548P", "Hugo Lorenzo Silva", 0);
        CuentaCorriente Persona2 = new CuentaCorriente("52966548P", "Hugo Lorenzo Silva");
        CuentaCorriente Persona3 = new CuentaCorriente("52966548P", 0);
        Persona1.ingresarDinero(50.0);
        Persona2.ingresarDinero(100.0);
        Persona3.ingresarDinero(-100.0);
        System.out.println(Persona1.sacarDinero(30.3));
        System.out.println(Persona1.sacarDinero(30.7));
        System.out.println(Persona2.sacarDinero(10));
        System.out.println(Persona3.sacarDinero(20));
        Persona1.mostrarInfo();
        Persona2.mostrarInfo();
        Persona3.mostrarInfo();
    }
}

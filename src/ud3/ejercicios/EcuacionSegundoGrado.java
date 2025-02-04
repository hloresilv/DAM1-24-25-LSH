
package ud3.ejercicios;

/*
 * P0712. Implementa una clase que permita resolver ecuaciones de segundo grado. Los
 * coeficientes pueden indicarse en el constructor y modificarse a posteriori. Es fundamental
 * que la clase disponga de un método que devuelva las distintas soluciones y de un método
 * que nos informe si el discriminante es positivo.
 */
public class EcuacionSegundoGrado {
    private double a = 0.0;
    private double b = 0.0;
    private double c = 0.0;
    private double solucion1;
    private double solucion2;
    private boolean esCorrecto = true;

    EcuacionSegundoGrado(double a, double b, double c) {
        if (2*a == 0 || (Math.pow(b, 2) - 4*a*c) < 0) {
            System.out.println("Ecuación imposible de resolver. No se guardarán datos de la ecuación.");
            esCorrecto = false;
        }

        this.a = a; // Siempre se guardará para obtener el discriminante si se llama a la función getDiscrminante();

        if (esCorrecto) {
            this.b = b;
            this.c = c;
        }
    }

    public void getSoluciones() {
        if (esCorrecto) {
            solucion1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c) / 2*a);
            solucion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c) / 2*a);
            System.out.println("Solución real 1:" + solucion1);
            System.out.println("Solución real 2:" + solucion2);
        }
    }

    public void getDiscriminante() {
        if (2*a > 0)
            System.out.println("El discriminante es positivo");
        else
            System.out.println("El discriminante no es positivo");
    }

    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(7.3, 50, 100);
        ecuacion.getDiscriminante();
        ecuacion.getSoluciones();
    }
}
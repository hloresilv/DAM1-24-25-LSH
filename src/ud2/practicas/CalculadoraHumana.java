package ud2.practicas;

import java.util.Scanner;

/*
 * El veterano concurso de La2 “Saber y Ganar” incluye un juego denominado la “Calculadora
Humana” en la que el concursante debe resolver operaciones matemáticas encadenadas en
un tiempo límite.
Las operaciones se realizan con números enteros e incluyen la suma, resta, división y
multiplicación de números elegidos aleatoriamente.
El juego comienza presentando al usuario una primera operación (a elegir aleatoriamente) entre
dos números enteros (también aleatorios) y solicitando que escriba el resultado por teclado.
Si el usuario escribe un resultado incorrecto se le solicitará que introduzca un nuevo valor por
teclado.
Si el usuario acierta, se presentará una nueva operación (la segunda) en la que el primer
operando será el resultado de la primera, mientras que el operador y el segundo operando serán
elegidos aleatoriamente.
Resuelta la segunda operación se presentará la tercera, luego la cuarta y así sucesivamente.
El juego termina cuando el jugador resuelve 7 operaciones correctamente, independientemente
del número de fallos que haya cometido.
En el programa de TV, el juego termina también cuando expira un temporizador deﬁnido
previamente (por ejemplo 59 segundos). Alternativamente a la implementación del temporizador
se puede establecer el ﬁn del juego cuando el jugador supera un número máximo de fallos
permitido.
Implementa el programa del juego con las siguentes especiﬁcaciones adicionales:
1. El número de operaciones, el número de segundos y el número de fallos permitidos se
deﬁnirán como constantes al inicio del programa para facilitar adaptar el juego y su
diﬁcultad.
2. Tanto los operandos como los resultados de las operaciones planteadas por el juego
estarán limitados a un valor máximo (por ejemplo 200). Es decir, si se le plantea al
usuario una multiplicación, el resultado no deberá superar este límite, por lo que habrá
que tenerlo en cuenta a la hora de generar los datos aleatorios. Se recomienda deﬁnir
también este valor como una constante.
3. En el caso de las divisiones, el programa deberá asegurar que el resultado es un número
entero.
Recomendaciones:
1. Divide el problema complejo en problemas más sencillos hasta que sean fáciles de ver y/o
implementar. Ejemplos:
a. La siguiente función devolverá el valor del segundo operando si el operador elegido
es una división, o -1 si no es posible generarlo (porque el operando1 es primo o
demasiado pequeño, por ejemplo)
static int obtenerOperando2Division(int operando1);
b. Puedes implementar funciones que intenten generar el segundo operando para las
otras operaciones posibles:static int obtenerOperando2Suma(int operando1);
static int obtenerOperando2Resta(int operando1);
static int obtenerOperando2Multiplicacion(int operando1);
c. etc.
 */
public class CalculadoraHumana {

    public static boolean comprobanteOperación(int respuestaUsuario, int resultado) {
        if (respuestaUsuario == resultado) {
            System.out.println("Respuesta correcta!!");
            return true;
        } else {
            System.out.println("Respuesta incorrecta :(");
            return false;
        }
    }

    public static int preguntar(int operacion) {
        int resultado = 0;
        int num1 = (int) (Math.random() * 200) + 1;
        int num2 = (int) (Math.random() * 200) + 1;
        System.out.println("Resuelve la siguiente operación:");

        switch (operacion) {
            case 1:
                while (num2 > num1) { // Asegurarse de que el número a dividir no sea mayor que el cociente para que
                                      // den números enteros en vez de decimales.
                    num2 = (int) (Math.random() * 200) + 1;
                }
                System.out.println(num1 + " / " + num2);
                if (num2 == 0) {
                    System.out.println("No dividisible entre cero.");
                } else {
                    resultado = num1 / num2;
                }
                break;
            case 2:
                System.out.println(num1 + " * " + num2);
                resultado = num1 * num2;
                break;
            case 3:
                System.out.println(num1 + " + " + num2);
                resultado = num1 + num2;
                break;
            case 4:
                System.out.println(num1 + " - " + num2);
                resultado = num1 - num2;
                break;

            default:
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        final int NUM_MAX_FALLOS = 5;
        final int NUM_OPERACIONES = 7;
        int numAciertos = 0;
        int numFallos = 0;

        Scanner sc = new Scanner(System.in);

        while (numAciertos < NUM_OPERACIONES && numFallos < NUM_MAX_FALLOS) {
            int operacion = (int) (Math.random() * 4) + 1;
            int resultado = preguntar(operacion);

            System.out.print("Respuesta: ");
            int respuestaUsuario = sc.nextInt();

            if (comprobanteOperación(respuestaUsuario, resultado)) {
                numAciertos++;
            } else {
                numFallos++;
            }
        }

        System.out.println("El juego ha terminado.");
        sc.close();
    }
}
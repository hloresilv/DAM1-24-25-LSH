package ud2.practicas;

import java.util.Scanner;

/*
 * O índice de masa corporal (IMC) é un indicador de saúde que asocia o peso e a altura dunha persoa.
É utilizado, entre outros, pola Organización Mundial da Saúde (OMS), para detectar problemas de
sobrepeso ou malnutrición en adultos. En nenos e adolescentes o IMC calcúlase do mesmo xeito
pero o resultado analízase de xeito distinto segundo a idade e o sexo. (Nota: o IMC é un indicador
moi doado de calcular e útil para clasificar o peso, pero con moitas limitacións, xa que non mide o
grado de grasa corporal nin ten en conta o tipo e forma do corpo de cada persoa)
Calcúlase segundo a operación:
onde a masa se expresa en kilogramos e a estatura en metros.
Implementa unha función coa seguinte declaración que calcule e devolva o IMC dunha persoa a
partir do seu peso e altura, en klos e centimetros respectivamente:
static double imc(double kg, double cm);
Crea un programa que calcule e amose o IMC dunha persoa adulta a partires do seu peso e altura
introducidos por teclado.
O programa deberá validar que os datos introducidos por teclado sexan números correctos:
● o peso introducirase en kg, poderá ter decimais e deberá estar entre 20 e 300 kg
● a altura introducirase como un número enteiro de centímetros, e deberá estar entre 50 e 250.
No caso de introducir letras, símbolos ou números inválidos ofrecerase ao usuario introducir un novo
valor.
O programa deberá amosar o valor calculado e o resultado segundo a seguinte clasificación da OMS.
Clasificación IMC (kg/m²)
Bajo peso <18,50
Normal 18,5 - 24,99
Sobrepeso ≥25,00
Obesidad ≥30,00
 */
public class IMC {
    public static double imc(double kg, double cm) {
        return kg / Math.pow(cm / 100, 2);
    }

    public static void clasifImcOms(double imc) {
        if (imc < 18.50) {
            System.out.println("Según la OMS, tienes bajo peso.");
        } else if (imc >= 18.5 & imc <= 24.99) {
            System.out.println("Según la OMS, tienes peso normal.");
        } else if (imc >= 25 & imc < 30) {
            System.out.println("Según la OMS, tienes sobrepeso.");
        } else {
            System.out.println("Según la OMS, tienes obesidad.");
        }
    }
    public static void main(String[] args) {
        int cm = 0;
        double kg = 0.0;

        Scanner sc = new Scanner(System.in);
        while ((cm < 50 || cm > 250) || (kg < 30 || kg > 300 )) {
            System.out.print("Inserta tu altura (cm): ");
            cm = sc.nextInt();
            System.out.print("Inserta tu peso (kg): ");
            kg = sc.nextDouble();
            if ((cm < 50 || cm > 250) || (kg < 30 || kg > 300 )) {
                System.out.println("Datos no válidos. Vuelve a introducirlos.");
            }
        }
        sc.close();
        System.out.printf("Tu IMC es de: %.2f \n", imc(kg, cm));
        clasifImcOms(imc(kg, cm));
    }
}
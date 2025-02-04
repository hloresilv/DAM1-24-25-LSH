package ud4.ejercicios;

public class Matriculas {
    String incrementarLetras(String matricula) {
        matricula = matricula.toLowerCase();
        String validLetters = "bcdfghjklmnprstvwxyz"; // Sin vocales, ni Q ni Ñ

        char numero1 = matricula.charAt(0);
        char numero2 = matricula.charAt(1);
        char numero3 = matricula.charAt(2);
        char numero4 = matricula.charAt(3);
        char letra1 = matricula.charAt(4);
        char letra2 = matricula.charAt(5);
        char letra3 = matricula.charAt(6);

        if (matricula.substring(4, matricula.length()).equals(0000)) {
            numero1 = '0';
            numero2 = '0';
            numero3 = '0';
            numero4 = '0';
            letra1 = 'B';
            letra2 = 'B';
            letra3 = 'B';
            return matricula;
        }

        char[] matriculaChar = matricula.toCharArray();
        int startPos = 0;
        for (int i = 4; i < matricula.length(); i++) {
            if (matriculaChar[i] != 9) {
                startPos = i; // Esta es la letra que tengo que incrementar de número
            }
        }

        return null;
    }

    String incrementarDigitos(String matricula, int startPos) {
        String validNumbers = "123456789";

        for (int i = startPos; i < matricula.length(); i++) {
            char actual = matricula.charAt(startPos);
            char replacement = validNumbers.charAt(startPos + 1);
            matricula = matricula.replace(actual, replacement);
        }

        return matricula;
    }

    String siguienteMatricula(String matricula) {
        if (!esMatriculaValida(matricula)) {
            return null;
        }

        Integer newNum = Integer.valueOf(matricula.substring(0, 4) + 1);
        boolean mellevoUna = false;
        if (newNum == 10000) {
            newNum = 0000;
            mellevoUna = true;
        }
        String numeros = String.format("%04d", newNum);

        String letras = matricula.substring(4, 7);
        letras = letras.toLowerCase();
        String validLetters = "bcdfghjklmnprstvwxyz"; // Sin vocales, ni Q ni Ñ

        for (int i = 2; i >= 0; i--) {
            if (mellevoUna) {
                if (letras.charAt(i) == 'Z' || letras.charAt(i) == 'z') {
                    letras = letras.replace(letras.charAt(i), 'B');
                    mellevoUna = true;
                }
                else {
                    letras = letras.replace(letras.charAt(i), validLetters.charAt(validLetters.indexOf(letras.charAt(i) + 1)));
                    mellevoUna = false;
                }
            }
        }

        return null;
    }

    boolean esMatriculaValida(String matricula) {
        matricula = matricula.toLowerCase();

        char numero1 = matricula.charAt(0);
        char numero2 = matricula.charAt(1);
        char numero3 = matricula.charAt(2);
        char numero4 = matricula.charAt(3);
        char letra1 = matricula.charAt(4);
        char letra2 = matricula.charAt(5);
        char letra3 = matricula.charAt(6);

        if (!Character.isDigit(numero1) || !Character.isDigit(numero2) || !Character.isDigit(numero3) || !Character.isDigit(numero4)) {
            return false;
        }

        // Suponiendo que no hay espacios
        if (!Character.isLetter(letra1) || !Character.isLetter(letra2) || !Character.isLetter(letra3)) {
            return false;
        }

        String blacklistedLetters = "aeiouñq";
        for (int i = 4; i < matricula.length(); i++) {
            if (blacklistedLetters.indexOf(matricula.toLowerCase().charAt(i)) != -1) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}

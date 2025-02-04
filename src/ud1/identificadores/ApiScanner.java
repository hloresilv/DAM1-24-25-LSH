package ud1.identificadores;

import java.time.LocalDate;
import java.util.Scanner;

public class ApiScanner {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
      System.out.print("¿Cómo te llamas? ");
      final String NAME = sc.nextLine();

      System.out.println("Hola " + NAME + ". Estamos aprendiendo a programar");

      System.out.print("¿En qué año naciste? ");
      final int BIRTHDAY_YEAR = sc.nextInt();
      final int CURRENT_YEAR = LocalDate.now().getYear();
      final int AGE = CURRENT_YEAR - BIRTHDAY_YEAR;

      System.out.println("Debes tener unos " + AGE + " años.");
    }
  }
}
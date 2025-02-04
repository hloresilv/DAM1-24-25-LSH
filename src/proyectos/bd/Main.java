package proyectos.bd;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcionUsuario = 0;

        Scanner sc = new Scanner(System.in);
        String usuario = UsuariosBD.iniciarSesion();

        do {
            System.out.println("1. Funcionalidad A");
            System.out.println("2. Funcionalidad B");
            System.out.println("0. SALIR");
            System.out.print("Opción: ");
            opcionUsuario = sc.nextInt();

            switch (opcionUsuario) {
                case 1: a(usuario); break;
                case 2: b(usuario); break;
                case 0: System.out.println("Hasta pronto"); break;
                default: System.out.println("Opción incorrecta"); break;
            }
                                                
        } while (opcionUsuario != 0);

        sc.close();
    }

    private static void a(String usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'B'");
    }

    private static void b(String usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'A'");
    }
}

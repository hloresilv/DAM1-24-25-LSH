package ud1.conversiones;

public class Conversiones {
    public static void main(String[] args) {
        short s = 5;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        d += 2000000.5;

        s = (short) d;
        System.out.println(d + " " + s);

        int a = 5;
        int b = 2;
        double resultado = a / b;
        System.out.println(resultado);

        int num = 65; // A
        char letra = (char) num;
        letra++;
        boolean mayuscula = letra >= 'A' && letra <= 'Z';
        System.out.println(letra + " es mayuscula? " + mayuscula);
        System.out.println("La letra mínuscula sería: " + (char)(letra + 32));
    }
}

package ud1.identificadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte vByte = 127;
        int vInt = -10000000;
        double vDouble = 35E23;
        float vFloat = 1.50f;
        char vChar = 'B';
        String vString = "hola";
        boolean vBool = true;
        long vLong = 4000000000000L;
        short vShort = 5;

        System.out.println("Tipo    NumBits    Valor");
        System.out.println("------------------------");
        System.out.println("byte    8           " + vByte);
        System.out.println("int     8*4         " + vInt);
        System.out.println("double  8*8      " + vDouble);
        System.out.println("float   4*8       " + vFloat);
        System.out.println("char    4*8        " + vChar);
        System.out.println("boolean 4*8     " + vBool);
        System.out.println("long    4*8        " + vLong);
        System.out.println("short    4*8        " + vShort);
        System.out.println("string           " + vString);
    }
}

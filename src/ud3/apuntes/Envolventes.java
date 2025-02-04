package ud3.apuntes;

public class Envolventes {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int k = 23;
        Integer num = k;

        String s = "-4.65";
        Float ft = Float.valueOf(s);
        float fPrim = ft;

        String s1 = "-25", s2 = "89.2";
        int n = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);

        int a = Integer.parseInt("101", 2);
        System.out.println(a);

        System.out.println("Fin");
    }
}

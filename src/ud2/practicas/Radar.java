package ud2.practicas;

/*
 * Os radares de tramo consisten en colocar dúas cámaras en dous puntos dunha estrada para
 * comprobar canto tempo tarda un vehículo en percorrer ese tramo. Segundo o teorema de
 * Bonnet-Lagrange ou do valor medio, se a velocidade media dun vehículo ao recorrer o tramo supera
 * a velocidade máxima permitida, podemos asegurar (aínda que non o viramos) que nalgún punto do
 * traxecto superouse a velocidade permitida.
 * Por exemplo: si colocamos as cámaras separadas 10Km nun tramo cuxa velocidade está limitada a
 * 110Km/h, e un coche tarda 5 minutos (300) en ser visto pola segunda cámara, saberemos que a súa
 * velocidade media foi de 120Km/h, e polo tanto nalgún sitio superou o límite de velocidade aínda que
 * ao pasar por debaixo das dúas cámaras o coche fose a 80Km/h.
 * Implementa unha función coa seguinte declaración que acepte como parámetros de entrada a
 * distancia en km, o tempo en segundos e o límite de velocidade en km/h e que devolva 0 se non se
 * superou o límite ou, en caso contrario, o exceso de velocidade en km/h.
 */

public class Radar {

    static int excesoVelocidade(double distancia, int tempo, int limite) {
        double velocidad_media = distancia / tempo;

        if (velocidad_media > limite) {
            return (int)(velocidad_media - limite);
        } else {
            return 0;
        }
    }

    static int multaInfraccion(int limite, double excesoVelocidade) {
        double velocidad = limite + excesoVelocidade;
        int multa = 0;

        if (limite <= 50) {
            if (excesoVelocidade <= 10) {
                if (velocidad < 70) {
                    multa = 100;
                } 
            } else {
                if (velocidad < 80) {
                    multa = 300;
                } else if (velocidad > 80 && velocidad <= 90) {
                    multa = 400;
                } else if (velocidad > 90 && velocidad <= 100) {
                    multa = 500;
                } else {
                    multa = 600;
                }
            }
        } else {
            if (excesoVelocidade <= 10) {
                if (velocidad < 80) {
                    multa = 300;
                } else if (velocidad > 80 && velocidad <= 90) {
                    multa = 400;
                } else if (velocidad > 90 && velocidad <= 100) {
                    multa = 500;
                } else {
                    multa = 600;
                }
            } else {
                
            }
        }

        return multa;
    }
    public static void main(String[] args) {
        assert excesoVelocidade(10, 600, 60) == 0;
        assert excesoVelocidade(10, 600, 50) == 10;
        assert excesoVelocidade(10, 600, 30) == 30;
        assert excesoVelocidade(15, 300, 120) == 60;
        assert excesoVelocidade(15, 300, 90) == 90;
        assert excesoVelocidade(10, 300, 120) == 0;
        assert excesoVelocidade(10, 300, 90) == 30;

        assert multaInfraccion(20, 0) == 0;
        assert multaInfraccion(20, 15) == 100;
        assert multaInfraccion(30, 21) == 300;
        assert multaInfraccion(40, 31) == 400;
        assert multaInfraccion(50, 50) == 500;
        assert multaInfraccion(50, 51) == 600;
        assert multaInfraccion(60, 0) == 0;
        assert multaInfraccion(70, 30) == 100;
        assert multaInfraccion(80, 31) == 300;
        assert multaInfraccion(90, 51) == 400;
        assert multaInfraccion(100, 61) == 500;
        assert multaInfraccion(110, 71) == 600;
        assert multaInfraccion(120, 1) == 100;
    }
}

public class Calculadora{

    public double soma(double numeroA, double numeroB) {

        return numeroA + numeroB;
    }

    public double subtracao(double numeroA, double numeroB) {

        return numeroA - numeroB;
    }

    public double multiplicacao(double numeroA, double numeroB) {

        return numeroA * numeroB;
    }

    public double divisao(double numeroA, double numeroB) {
        return numeroA / numeroB;
    }

    public double exponencial(double numeroA, double numeroB) {
        return Math.pow (numeroA, numeroB);
    }

    public double raizQuadrada(double numeroA){
        return Math.sqrt (numeroA);
    }

    public double piso(double numeroA){
        return Math.floor (numeroA);
    }
}

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
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        return Math.pow (numeroA, numeroB);
    }
}
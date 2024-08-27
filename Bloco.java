public class Bloco {
    int valor;
    Bloco prox;
    public static void main(String[] args) {
        Bloco b1 = new Bloco();
        b1.valor = 3;
        Bloco b2 = new Bloco();
        b2.valor = 9;
        b1.prox = b2;
        Bloco b3 = new Bloco();
        b3.valor = 30;
        b2.prox = b3;
}

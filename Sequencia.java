public class Bloco {
    int valor;
    Bloco prox;
    public static void main(String[] args) {
        Bloco inicio = new Bloco();
        inicio.valor = 1;
        Bloco b1 = new Bloco();
        b1.valor = 3;
        inicio.prox = b1;
        Bloco b2 = new Bloco();
        b2.valor = 9;
        b1.prox = b2;
        Bloco b3 = new Bloco();
        b3.valor = 30;
        b2.prox = b3;
        Bloco aux = inicio;
        while (aux.prox != null) {
            aux = aux.prox;
            System.out.println(aux.valor);
            Bloco b4 = new Bloco();
            b4.valor = 100;
            aux.prox = b4;
            aux = b1;
            while (aux.prox != null) {
                
                System.out.println(aux.valor);
                aux = aux.prox;
            
        }

    }
}
}

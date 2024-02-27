public class Main {
    public static void main(String[] args) {
        Produto teclado = new Produto(1, "Teclado muito foda", 29, 500);

        teclado.dadosProduto();
        teclado.aumentarPreco(1000);
        teclado.diminuirPreco(285);
        teclado.comprar(6);
        teclado.vender(29);
        teclado.dadosProduto();
    }
}

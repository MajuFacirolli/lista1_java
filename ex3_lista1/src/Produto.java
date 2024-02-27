public class Produto {
    public int id;
    public String descricao;
    public int qntde;
    public float preco;

    public Produto(int id, String descricao, int qntde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qntde = qntde;
        this.preco = preco;
    }

    public void comprar(int x) {
        qntde += x;
    }

    public void vender(int x) {
        if( x > qntde && x <= 0) {
            System.out.println("Não é possível realizar a venda");
            return;
        }
        qntde -= x;
    }

    public void aumentarPreco(float x) {
        if(x <= 0){
            System.out.println("Valor inválido");
            return;
        }
        preco += x;
    }

    public void diminuirPreco(float x) {
        if(x <= 0){
            System.out.println("Valor inválido");
            return;
        }
        preco -= x;
    }

    public void dadosProduto() {
        System.out.println("id: " + id +"\nDescrição: " + descricao + "\nQuantidade: " + qntde +"\nPreço: R$" + preco);
    }
}

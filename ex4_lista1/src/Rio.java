public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        if(x <=0) {
            throw new RuntimeException("Valor inválido");
        }
        nivel += x;
    }

    public void ensolarar(float x) {
        if(x <=0) {
            throw new RuntimeException("Valor inválido");
        }
        nivel -= x;
    }

    public void limpar() {
        if(poluido) {
            poluido = false;
            return;
        }
    }

    public void sujar() {
        if(!poluido) {
            poluido = true;
            return;
        }
    }

    @Override
    public String toString() {
        return "Rio: " + nome +
                "\nNível= " + nivel +
                "\nPoluído= " + poluido;
    }
}

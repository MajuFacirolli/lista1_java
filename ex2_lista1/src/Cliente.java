public class Cliente {
    public int numConta;
    public int numAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numConta, int numAgencia, String nome, float saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x) {
        saldo += x;
    }

    public void realizarSaque(float x) {
        saldo -= x;
    }

    public void dadosCliente() {
        System.out.println("Nome: " + nome + "\nNúmero da conta: " + numConta + "\nSaldo atual: " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cleyton = new Cliente(2342689,2,"Cleyton", 4000.50f);

        cleyton.dadosCliente();
        cleyton.realizarDeposito(1030);
        cleyton.dadosCliente();
        cleyton.realizarSaque(2000);
        cleyton.dadosCliente();
    }
}

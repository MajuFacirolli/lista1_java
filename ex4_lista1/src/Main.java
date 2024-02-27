public class Main {
    public static void main(String[] args) {
        Rio pardo = new Rio("Pardo", 6000, true);

        System.out.println(pardo.toString());
        pardo.chover(52);
        System.out.println(pardo.toString());
        pardo.ensolarar(9);
        System.out.println(pardo.toString());
        pardo.limpar();
        System.out.println(pardo.toString());
    }
}

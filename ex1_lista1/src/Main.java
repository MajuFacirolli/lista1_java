public class Main {
    public static void main(String[] args) {
        Aluno Maju = new Aluno(25071, "Maju", 19, 10,10);
        Aluno Cleyton = new Aluno(24820, "Cleyton", 19, 9.5F, 8.2F);

        Maju.dadosAluno();
        System.out.println("Média final: " + Maju.notaFinal());
        Maju.passou();


        Cleyton.dadosAluno();
        System.out.println("Média final: " + Cleyton.notaFinal());
        Cleyton.passou();
    }
}

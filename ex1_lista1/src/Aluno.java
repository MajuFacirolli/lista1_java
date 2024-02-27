public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        return (p1 + p2) / 2;
    }

    public void dadosAluno() {
        System.out.println("Número: " + this.numeroAluno + "\nNome: " + this.nome +"\nIdade: " + this.idade);
    }

    public void passou() {
        float media = notaFinal();
        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
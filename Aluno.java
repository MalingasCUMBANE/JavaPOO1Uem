public class Aluno {

    private String nome;
    private byte idade;
    private char sexo;
    private float media;
 
    public Aluno(String nome, byte idade, char sexo, float media) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
    }

    public String toString() {
        return nome +"\n" + idade + "\n" + sexo +"\n" + media;
    }
}

package cadastrodeclientes;

public abstract class Cliente {
    protected String nome, fone, idade, sexo, EstadoCivil;
    protected boolean contratado;

    public Cliente(String nome, String fone, String idade, String sexo, String EstadoCivil) {
        this.nome = nome;
        this.fone = fone;
        this.idade = idade;
        this.sexo = sexo;
        this.EstadoCivil = EstadoCivil;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", fone=" + fone + ", idade=" + idade + ", sexo=" + sexo + ", EstadoCivil=" + EstadoCivil;
    }
    
    
}

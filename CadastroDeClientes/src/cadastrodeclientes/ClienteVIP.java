
package cadastrodeclientes;

public class ClienteVIP extends Cliente {
    private double desconto;

    public ClienteVIP(String nome, String fone, String idade, String sexo, String EstadoCivil) {
        super(nome, fone, idade, sexo, EstadoCivil);
    }
}

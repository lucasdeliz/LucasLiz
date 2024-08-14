package Exercicio11;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;

    public Fornecedor(String nome, String cnpj, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                "\nCNPJ: '" + cnpj + '\'' +
                "\nTelefone: '" + telefone + "\'\n";
    }
}

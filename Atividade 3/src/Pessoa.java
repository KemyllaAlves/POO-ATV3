import javax.xml.crypto.Data;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Data dataNascimento;
    private String rg;
    private String cpf;
    private Data dataInsercao;
    public Pessoa(int codigo, String nome, String endereco, String telefone, Data dataNascimento, String rg, String cpf,
            Data dataInsercao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Data getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Data getDataInsercao() {
        return dataInsercao;
    }
    public void setDataInsercao(Data dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
    
}

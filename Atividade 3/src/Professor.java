import javax.xml.crypto.Data;

public class Professor {

    private String registro;
    private Data dataContratacao;
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public Data getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(Data dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Professor() {
    }
    public Professor(String registro, Data dataContratacao) {
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }  
    
    
}

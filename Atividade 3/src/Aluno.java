public class Aluno {
    private String matricula;
    private Data dataMatricula;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Data getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(Data dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public Aluno() {
    }
    public Aluno(String matricula, Data dataMatricula) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
}
